package org.newcommerce.product.service;

import lombok.RequiredArgsConstructor;
import org.newcommerce.common.exception.CommerceException;
import org.newcommerce.product.config.mapstruct.ProductMapper;
import org.newcommerce.product.domain.Product;
import org.newcommerce.product.domain.ProductRepository;
import org.newcommerce.product.dto.ProductResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    @Override
    public ProductResponse getProduct(final Long productNo) {
        final Product product = productRepository.findByNo(productNo)
                .orElseThrow(CommerceException::new);
        return productMapper.toDto(product);
    }
}
