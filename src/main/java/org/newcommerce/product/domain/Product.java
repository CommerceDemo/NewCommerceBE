package org.newcommerce.product.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.newcommerce.common.BaseEntity;
import org.newcommerce.common.Money;
import org.newcommerce.common.config.converter.MoneyConverter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Product extends BaseEntity {

    @Id
    @Column(name = "product_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @OneToOne(fetch = LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_detail_no")
    private ProductDetail productDetail;

    private String productName;

    @Convert(converter = MoneyConverter.class)
    private Money price;

    private String brand;
}
