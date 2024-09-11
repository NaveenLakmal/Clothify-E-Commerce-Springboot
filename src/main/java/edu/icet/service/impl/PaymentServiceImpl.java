package edu.icet.service.impl;

import edu.icet.dto.PaymentDto;
import edu.icet.service.PaymentService;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public boolean addPayment(PaymentDto paymentDto) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<PaymentDto> getAll() {
        return null;
    }

    @Override
    public PaymentDto findOne(long id) {
        return null;
    }

    @Override
    public boolean updatePaymentById(long id, PaymentDto paymentDto) {
        return false;
    }
}
