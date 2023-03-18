package org.idd.productorderservicekotlin.order

import io.kotest.matchers.shouldBe
import org.idd.productorderservicekotlin.order.domain.Order
import org.idd.productorderservicekotlin.product.domain.DiscountPolicy
import org.idd.productorderservicekotlin.product.domain.Product
import org.junit.jupiter.api.Test

class OrderTest {
    @Test
    fun getTotalPrice() {
        val order = Order(Product("상품명", 2000, DiscountPolicy.FIX_1000_AMOUNT), 2)

        val totalPrice = order.getTotalPrice()

        totalPrice shouldBe 2000
    }
}
