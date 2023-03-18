package org.idd.productorderservicekotlin.order.application.port

import org.idd.productorderservicekotlin.order.domain.Order
import org.idd.productorderservicekotlin.product.domain.Product

interface OrderPort {
    fun getProductById(productId: Long): Product

    fun save(order: Order)
}
