package org.idd.productorderservicekotlin.product

import io.kotest.matchers.shouldBe
import org.idd.productorderservicekotlin.product.domain.DiscountPolicy
import org.idd.productorderservicekotlin.product.domain.Product
import org.junit.jupiter.api.Test

class ProductTest {

    @Test
    fun update() {
        val product = Product("상품명", 1000, DiscountPolicy.NONE)

        product.update("상품 수정", 2000, DiscountPolicy.NONE)

        product.name shouldBe "상품 수정"
        product.price shouldBe 2000
    }

    @Test
    fun none_discounted_product() {
        val product = Product("상품명", 1000, DiscountPolicy.NONE)

        val discountedPrice = product.getDiscountedPrice()

        discountedPrice shouldBe 1000
    }

    @Test
    fun fix_1000_discounted_product() {
        val product = Product("상품명", 1000, DiscountPolicy.FIX_1000_AMOUNT)

        val discountedPrice = product.getDiscountedPrice()

        discountedPrice shouldBe 0
    }
}
