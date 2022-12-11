package org.newcommerce.product.dto;


import lombok.Builder;
import lombok.Getter;
import org.newcommerce.common.Money;

@Getter
@Builder
public class ProductResponse {

    private Long no;
    private ProductDetailResponse productDetail;
    private String productName;
    private Money price;
    private String brand;
}