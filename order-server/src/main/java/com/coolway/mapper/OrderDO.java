package com.coolway.mapper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class OrderDO {

    /**
     * 订单ID
     */
    String orderId;

    /**
     * 商品ID
     */
    String productId;

    /**
     * 商品名称
     */
    String productName;

    /**
     * 商品数量
     */
    int productNumber;
}
