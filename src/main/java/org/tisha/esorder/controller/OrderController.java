package org.tisha.esorder.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tisha.esorder.vo.OrderVO;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public ResponseEntity<List<OrderVO>> getOrders() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(Stream.of(OrderVO.builder().id(UUID.randomUUID()).details("Order 1").build(),
                                OrderVO.builder().id(UUID.randomUUID()).details("Order 2").build(),
                                OrderVO.builder().id(UUID.randomUUID()).details("Order 3").build()
                        ).toList()
                );
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderVO> getOrder(@PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(OrderVO.builder().id(id).details("Order 1").build());
    }

    @PostMapping
    public ResponseEntity<OrderVO> createOrder(OrderVO orderVO) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(OrderVO.builder().id(UUID.randomUUID()).details("New Order 1").build());
    }

}
