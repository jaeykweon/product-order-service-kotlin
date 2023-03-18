package org.idd.productorderservicekotlin.payment.domain

import org.idd.productorderservicekotlin.order.domain.Order
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "payments")
class Payment(
    order: Order,
    cardNumber: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L
    @OneToOne
    var order: Order = order
        private set
    var cardNumber: String = cardNumber
        private set

    init {
        require(cardNumber.isNotEmpty()) { "카드 번호는 필수입니다." }
    }

    fun getPrice(): Int = order.getTotalPrice()
}
