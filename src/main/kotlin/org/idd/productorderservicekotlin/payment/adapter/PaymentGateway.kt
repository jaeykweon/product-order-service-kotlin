package org.idd.productorderservicekotlin.payment.adapter

interface PaymentGateway {
    fun execute(totalPrice: Int, cardNumber: String)
}
