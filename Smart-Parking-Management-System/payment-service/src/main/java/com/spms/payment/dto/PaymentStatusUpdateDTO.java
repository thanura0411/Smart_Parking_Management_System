package com.spms.payment.dto;

import com.spms.payment.entity.Payment.PaymentStatus;
import lombok.Data;

@Data
public class PaymentStatusUpdateDTO {
    private PaymentStatus status;
    private String transactionId;
    private String failureReason;
}