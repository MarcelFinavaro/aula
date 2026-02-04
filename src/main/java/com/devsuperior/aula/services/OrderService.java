package com.devsuperior.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.aula.entities.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double discountedValue = order.getBasic() * (1 - order.getDiscount() / 100);
        double shippingValue = shippingService.shipment(order.getBasic());
        return discountedValue + shippingValue;
    }
}