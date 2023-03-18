package org.idd.productorderservicekotlin.payment.adapter

import org.idd.productorderservicekotlin.order.adapter.OrderRepository
import org.idd.productorderservicekotlin.order.domain.Order
import org.idd.productorderservicekotlin.payment.application.port.PaymentPort
import org.idd.productorderservicekotlin.payment.domain.Payment
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class PaymentAdapter(
    private val paymentGateway: PaymentGateway,
    private val paymentRepository: PaymentRepository,
    private val orderRepository: OrderRepository
) : PaymentPort {

    override fun getOrder(orderId: Long): Order {
        return orderRepository.findByIdOrNull(orderId)
            ?: throw IllegalArgumentException("주문이 존재하지 않습니다.")
    }

    override fun pay(totalPrice: Int, cardNumber: String) {
        paymentGateway.execute(totalPrice, cardNumber)
    }

    override fun save(payment: Payment) {
        paymentRepository.save(payment)
    }
}
