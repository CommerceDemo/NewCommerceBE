package org.newcommerce.product.service;

import org.newcommerce.product.dto.ProductResponse;

public interface ProductService {

    ProductResponse getProduct(Long productSeq);
}
