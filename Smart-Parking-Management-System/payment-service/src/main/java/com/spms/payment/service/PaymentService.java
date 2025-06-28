// PaymentService.java
package com.spms.payment.service;

import com.spms.payment.dto.PaymentRequestDTO;
import com.spms.payment.dto.PaymentResponseDTO;
import com.spms.payment.dto.PaymentStatusUpdateDTO;
import com.spms.payment.entity.Payment;

import java.util.List;

public interface PaymentService {
    PaymentResponseDTO createPayment(PaymentRequestDTO paymentRequestDTO);
    PaymentResponseDTO getPaymentById(Long id);
    List<PaymentResponseDTO> getPaymentsByUser(Long userId);
    PaymentResponseDTO updatePaymentStatus(String paymentId, PaymentStatusUpdateDTO statusUpdateDTO);
    Payment getPaymentEntityByPaymentId(String paymentId);
}