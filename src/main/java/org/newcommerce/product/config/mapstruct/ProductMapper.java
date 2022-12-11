package org.newcommerce.product.config.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.newcommerce.common.config.mapstruct.GenericMapper;
import org.newcommerce.product.domain.Product;
import org.newcommerce.product.dto.ProductResponse;

@Mapper(componentModel = "spring")
public interface ProductMapper extends GenericMapper<ProductResponse, Product> {

    @Override
    @Mapping(source = "productDetail.no", target = "productDetail.no")
    @Mapping(source = "productDetail.detailImg", target = "productDetail.detailImg")
    ProductResponse toDto(Product product);
}
