package org.idd.productorderservicekotlin.product.application.port

import org.idd.productorderservicekotlin.product.domain.Product

interface ProductPort {
    fun save(product: Product)

    fun getProduct(productId: Long): Product
}
