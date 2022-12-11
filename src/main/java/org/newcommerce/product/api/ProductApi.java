package org.newcommerce.product.api;

import lombok.RequiredArgsConstructor;
import org.newcommerce.common.dto.BaseResponseEntity;
import org.newcommerce.product.dto.ProductDetailResponse;
import org.newcommerce.product.dto.ProductResponse;
import org.newcommerce.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductApi {

    private final ProductService productService;

    @GetMapping("/{productSeq}")
    public BaseResponseEntity<ProductResponse> getArticleDetail(@PathVariable("productSeq") final Long productSeq) {
        return new BaseResponseEntity<>(productService.getProduct(productSeq));
    }
}
