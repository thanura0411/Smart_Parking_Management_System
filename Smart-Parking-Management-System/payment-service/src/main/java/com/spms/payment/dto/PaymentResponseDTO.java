package com.spms.payment.dto;

import com.spms.payment.entity.Payment.PaymentMethod;
import com.spms.payment.entity.Payment.PaymentStatus;
import lombok.Data;


import java.time.LocalDateTime;

@Data
public class PaymentResponseDTO {
    private Long id;
    private String paymentId;
    private Long userId;
    private Long parkingSpaceId;
    private Long vehicleId;
    private Double amount;
    private PaymentStatus status;
    private PaymentMethod method;
    private String cardNumber;
    private String cardHolderName;
    private String transactionId;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime processedAt;
    private String failureReason;
}