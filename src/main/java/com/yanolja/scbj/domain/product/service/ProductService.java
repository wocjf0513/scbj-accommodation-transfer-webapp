package com.yanolja.scbj.domain.product.service;

import com.yanolja.scbj.domain.hotelRoom.dto.response.RoomThemeFindResponse;
import com.yanolja.scbj.domain.hotelRoom.entity.Hotel;
import com.yanolja.scbj.domain.hotelRoom.entity.Room;
import com.yanolja.scbj.domain.hotelRoom.entity.RoomTheme;
import com.yanolja.scbj.domain.member.entity.Member;
import com.yanolja.scbj.domain.member.entity.YanoljaMember;
import com.yanolja.scbj.domain.member.exception.MemberNotFoundException;
import com.yanolja.scbj.domain.member.repository.MemberRepository;
import com.yanolja.scbj.domain.product.dto.request.ProductPostRequest;
import com.yanolja.scbj.domain.product.dto.response.ProductFindResponse;
import com.yanolja.scbj.domain.product.dto.response.ProductPostResponse;
import com.yanolja.scbj.domain.product.dto.response.ProductFindResponse;
import com.yanolja.scbj.domain.product.entity.Product;
import com.yanolja.scbj.domain.product.exception.FirstPriceHigherException;
import com.yanolja.scbj.domain.product.exception.ProductNotFoundException;
import com.yanolja.scbj.domain.product.exception.SecondPriceHigherException;
import com.yanolja.scbj.domain.product.repository.ProductRepository;
import com.yanolja.scbj.domain.reservation.entity.Reservation;
import com.yanolja.scbj.domain.reservation.exception.ReservationNotFoundException;
import com.yanolja.scbj.domain.reservation.repository.ReservationRepository;
import com.yanolja.scbj.global.exception.ErrorCode;
import com.yanolja.scbj.global.util.SeasonValidator;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.yanolja.scbj.global.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final MemberRepository memberRepository;
    private final ReservationRepository reservationRepository;
    private final ProductRepository productRepository;
    private final ProductDtoConverter productDtoConverter;

    @Transactional
    public ProductPostResponse postProduct(Long memberId, Long reservationId,
        ProductPostRequest productPostRequest) {

        Member member = memberRepository.findById(memberId)
            .orElseThrow(() -> new MemberNotFoundException(ErrorCode.MEMBER_NOT_FOUND));

        YanoljaMember yanoljaMember = member.getYanoljaMember();

        Reservation reservation = reservationRepository.findByIdAndYanoljaMemberId(reservationId,
            yanoljaMember.getId()).orElseThrow(
            () -> new ReservationNotFoundException(ErrorCode.RESERVATION_NOT_FOUND));

        // 양도 가격이 구매가보다 높습니다. 양도 가격을 확인해주세요.
        if (productPostRequest.getFirstPrice() > reservation.getPurchasePrice()) {
            throw new FirstPriceHigherException(ErrorCode.FIRST_PRICE_HIGHER);
        }

        // 2차 양도 가격이 1차 양도 가격보다 높습니다. 2차 가격을 확인해주세요.
        if (productPostRequest.getSecondPrice() > productPostRequest.getFirstPrice()) {
            throw new SecondPriceHigherException(ErrorCode.SECOND_PRICE_HIGHER);
        }

        // 2차 양도 시점이 체크인 잔류시간보다 작아야한다. (기획미정)
        // 체크인 : 2월 16일(Reservation - 시작날짜) + 10:00 (Hotel - 체크인)
        // 지금 : 2월 15일 10:00
        // 2차 양도 시점 : 체크인 시간 - 지금 보다 작아야한다.
        //if(productPostRequest.getSecondGrantPeriod() )

        Product product = Product.builder()
            .reservation(reservation)
            .member(member)
            .firstPrice(productPostRequest.getFirstPrice())
            .secondPrice(productPostRequest.getSecondPrice())
            .bank(productPostRequest.getBank())
            .accountNumber(productPostRequest.getAccountNumber())
            .secondGrantPeriod(productPostRequest.getSecondGrantPeriod()).build();

        Product savedProduct = productRepository.save(product);

        return ProductPostResponse.builder().productId(savedProduct.getId()).build();

    }

    @Transactional(readOnly = true)
    public ProductFindResponse findProduct(Long productId) {
        Product foundProduct = productRepository.findById(productId)
            .orElseThrow(() -> new ProductNotFoundException(ErrorCode.PRODUCT_NOT_FOUND));

        return productDtoConverter.toFindResponse(foundProduct);
    }
}
