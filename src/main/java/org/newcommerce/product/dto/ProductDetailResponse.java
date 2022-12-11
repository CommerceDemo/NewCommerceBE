package org.newcommerce.product.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductDetailResponse {
    private Long no;
    private String detailImg;
}
