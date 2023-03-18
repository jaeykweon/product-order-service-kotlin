package org.idd.productorderservicekotlin.product.application.service

import org.idd.productorderservicekotlin.product.domain.DiscountPolicy

data class GetProductResponse(
    val id: Long,
    val name: String,
    val price: Int,
    val discountPolicy: DiscountPolicy
) {
    init {
        require(name.isNotBlank()) { "상품명은 필수입니다." }
    }
}
