package org.idd.productorderservicekotlin.order.domain

import org.idd.productorderservicekotlin.product.domain.Product
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "oreders")
class Order(
    product: Product,
    quantity: Int
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    @OneToOne
    var product: Product = product
        private set
    var quantity: Int = quantity
        private set

    init {
        require(quantity > 0) { "수량은 0보다 커야 합니다." }
    }

    fun getTotalPrice(): Int {
        return product.getDiscountedPrice() * quantity
    }
}
