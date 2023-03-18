package org.idd.productorderservicekotlin.product.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "products")
class Product(
    name: String,
    price: Int,
    discountPolicy: DiscountPolicy
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L
    var name: String = name
        private set
    var price: Int = price
        private set
    var discountPolicy: DiscountPolicy = discountPolicy
        private set

    init {
        require(name.isNotBlank()) { "상품명은 필수입니다." }
        require(price > 0) { "상품 가격은 0보다 커야 합니다." }
    }

    fun update(name: String, price: Int, discountPolicy: DiscountPolicy) {
        require(name.isNotBlank()) { "상품명은 필수입니다." }
        require(price > 0) { "상품 가격은 0보다 커야 합니다." }
        this.name = name
        this.price = price
        this.discountPolicy = discountPolicy
    }

    fun getDiscountedPrice(): Int = discountPolicy.applyDiscount(price)
}
