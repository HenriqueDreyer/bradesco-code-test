package com.dreyer.bradescocodechallenge.business.domain.gateway;

import com.dreyer.bradescocodechallenge.business.domain.entity.Checkout;
import com.dreyer.bradescocodechallenge.business.domain.entity.Payment;

public interface PaymentGateway {
    Payment generatePayment(Checkout checkout);
}
