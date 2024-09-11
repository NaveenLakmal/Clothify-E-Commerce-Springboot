package edu.icet.service;

import edu.icet.dto.CustomerDto;
import edu.icet.dto.PaymentDto;

import java.util.List;

public interface PaymentService {

    boolean addPayment(PaymentDto paymentDto);

    boolean delete(long id);

    List<PaymentDto> getAll();

    PaymentDto findOne(long id);

    boolean updatePaymentById(long id,PaymentDto paymentDto);
}
