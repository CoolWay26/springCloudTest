package com.coolway.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "订单服务")
public class OrderController {

    @PostMapping("/addOrder")
    @ApiOperation(value = "添加订单")
    public void addOrder(OrderVO orderVO) {

    }
}
