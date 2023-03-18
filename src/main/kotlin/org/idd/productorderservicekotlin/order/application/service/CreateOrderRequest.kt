package org.idd.productorderservicekotlin.order.application.service

data class CreateOrderRequest(
    val productId: Long,
    val quantity: Int
) {
    init {
        require(quantity > 0) { "수량은 0보다 커야합니다." }
    }
}
