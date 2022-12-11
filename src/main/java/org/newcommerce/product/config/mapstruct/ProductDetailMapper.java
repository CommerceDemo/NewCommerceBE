package org.newcommerce.product.config.mapstruct;

import org.mapstruct.Mapper;
import org.newcommerce.common.config.mapstruct.GenericMapper;
import org.newcommerce.product.domain.ProductDetail;
import org.newcommerce.product.dto.ProductDetailResponse;

@Mapper(componentModel = "spring")
public interface ProductDetailMapper extends GenericMapper<ProductDetailResponse, ProductDetail> {
}
