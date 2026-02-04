package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(double basicValue) {
        if (basicValue < 100.0) {
            return 20.0;
        }
        else if (basicValue < 200.0) {
            return 12.0;
        }
        else {
            return 0.0;
        }
    }
}
