package org.tisha.esorder.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.tisha.esorder.vo.OrderVO;

import java.util.List;


@SpringBootTest
@ExtendWith(SpringExtension.class)
//todo context is created for every test
class OrderControllerIntegrationTest {

    @Autowired
    OrderController orderController;

    @Test
    void contextLoads() {
        Assertions.assertThat(orderController).isNotNull();
    }

    @Test
    void testGetOrders() {
        ResponseEntity<List<OrderVO>> orders = orderController.getOrders();
        Assertions.assertThat(orders).isNotNull();
        Assertions.assertThat(orders.getBody()).isNotNull();
        Assertions.assertThat(orders.getBody()).hasSize(3);
    }
}