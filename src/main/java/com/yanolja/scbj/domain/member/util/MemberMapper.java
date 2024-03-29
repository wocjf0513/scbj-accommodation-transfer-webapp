package com.yanolja.scbj.domain.member.util;

import com.yanolja.scbj.domain.member.dto.request.MemberSignUpRequest;
import com.yanolja.scbj.domain.member.dto.request.MemberUpdateAccountRequest;
import com.yanolja.scbj.domain.member.dto.response.MemberResponse;
import com.yanolja.scbj.domain.member.dto.response.MemberSignInResponse;
import com.yanolja.scbj.domain.member.dto.response.TokenResponse;
import com.yanolja.scbj.domain.member.entity.Authority;
import com.yanolja.scbj.domain.member.entity.Member;
import com.yanolja.scbj.domain.member.entity.MemberAgreement;
import com.yanolja.scbj.domain.product.dto.request.ProductPostRequest;
import java.util.Collections;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberMapper {


    public static Member toMember(MemberSignUpRequest signUpMemberRequest, String encodePassword) {
        return Member.builder()
            .email(signUpMemberRequest.email())
            .password(encodePassword)
            .phone(signUpMemberRequest.phone())
            .name(signUpMemberRequest.name())
            .memberAgreement(MemberAgreement.builder().termOfUse(signUpMemberRequest.termOfUse())
                .privacyPolicy(signUpMemberRequest.privacyPolicy()).build())
            .authority(Authority.ROLE_USER)
            .build();
    }

    public static MemberResponse toMemberResponse(Member member) {
        return MemberResponse.builder()
            .id(member.getId())
            .email(member.getEmail())
            .name(member.getName())
            .phone(member.getPhone())
            .linkedToYanolja(member.getYanoljaMember() != null)
            .accountNumber(member.getAccountNumber())
            .bank(member.getBank())
            .build();
    }

    public static TokenResponse toTokenResponse(String accessToken, String refreshToken) {
        return TokenResponse.builder()
            .accessToken(accessToken)
            .refreshToken(refreshToken)
            .build();
    }

    public static MemberSignInResponse toSignInResponse(MemberResponse memberResponse,
        TokenResponse tokenResponse) {
        return MemberSignInResponse.builder()
            .memberResponse(memberResponse)
            .tokenResponse(tokenResponse)
            .build();
    }

    public static UserDetails toUserDetails(Member member) {
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(
            member.getAuthority().toString());
        return new User(
            String.valueOf(member.getId()),
            member.getPassword(),
            Collections.singleton(grantedAuthority));
    }

    public static MemberUpdateAccountRequest toUpdateAccountRequest(
        ProductPostRequest productPostRequest) {
        return MemberUpdateAccountRequest.builder()
            .accountNumber(productPostRequest.accountNumber())
            .bank(productPostRequest.bank())
            .build();
    }

}
