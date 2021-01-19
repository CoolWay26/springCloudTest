package com.coolway.controller;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class OrderVO {

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
