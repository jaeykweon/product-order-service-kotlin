package org.idd.productorderservicekotlin.payment.adapter

import org.springframework.stereotype.Component

@Component
class ConsolePaymentGateway : PaymentGateway {
    override fun execute(totalPrice: Int, cardNumber: String) {
        println("결제 완료")
    }
}
