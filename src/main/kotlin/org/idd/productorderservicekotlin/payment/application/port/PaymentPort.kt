package org.idd.productorderservicekotlin.payment.application.port

import org.idd.productorderservicekotlin.order.domain.Order
import org.idd.productorderservicekotlin.payment.domain.Payment

interface PaymentPort {
    fun getOrder(orderId: Long): Order

    fun pay(totalPrice: Int, cardNumber: String)

    fun save(payment: Payment)
}
