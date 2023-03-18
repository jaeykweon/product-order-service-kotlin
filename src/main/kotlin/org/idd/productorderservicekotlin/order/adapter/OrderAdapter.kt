package org.idd.productorderservicekotlin.order.adapter

import org.idd.productorderservicekotlin.order.application.port.OrderPort
import org.idd.productorderservicekotlin.order.domain.Order
import org.idd.productorderservicekotlin.product.adapter.ProductRepository
import org.idd.productorderservicekotlin.product.domain.Product
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import kotlin.IllegalArgumentException

@Component
class OrderAdapter(
    private val productRepository: ProductRepository,
    private val orderRepository: OrderRepository
) : OrderPort {
    override fun getProductById(productId: Long): Product {
        return productRepository.findByIdOrNull(productId)
            ?: throw IllegalArgumentException()
    }

    override fun save(order: Order) {
        orderRepository.save(order)
    }
}
