package org.idd.productorderservicekotlin.product.domain

import kotlin.math.max

enum class DiscountPolicy {
    NONE {
        override fun applyDiscount(price: Int): Int = price
    },
    FIX_1000_AMOUNT {
        override fun applyDiscount(price: Int): Int = max(price - 1000, 0)
    }
    ;
    abstract fun applyDiscount(price: Int): Int
}
