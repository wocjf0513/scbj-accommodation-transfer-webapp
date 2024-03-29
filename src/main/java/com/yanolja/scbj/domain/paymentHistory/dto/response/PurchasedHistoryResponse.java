package com.yanolja.scbj.domain.paymentHistory.dto.response;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record PurchasedHistoryResponse(
    @NotNull
    Long id,
    LocalDateTime createdAt,
    String imageUrl,
    String name,
    String roomType,
    Integer price,
    LocalDateTime checkInDate,
    LocalDateTime checkOutDate
) {
}
