package org.idd.productorderservicekotlin.product

import io.kotest.matchers.shouldBe
import org.idd.productorderservicekotlin.product.domain.DiscountPolicy
import org.junit.jupiter.api.Test

class DiscountPolicyTest {

    @Test
    fun noneDiscountPolicy() {
        val price = 1000

        val discountedPrice: Int = DiscountPolicy.NONE.applyDiscount(price)

        discountedPrice shouldBe price
    }

    @Test
    fun fix_1000_discounted_price() {
        val price = 2000

        val discountedPrice: Int = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price)

        discountedPrice shouldBe 1000
    }

    @Test
    fun over_discounted_price() {
        val price = 500

        val discountedPrice: Int = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price)

        discountedPrice shouldBe 0
    }
}
