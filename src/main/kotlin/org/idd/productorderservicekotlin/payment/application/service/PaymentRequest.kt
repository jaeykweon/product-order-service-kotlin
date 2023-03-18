package org.idd.productorderservicekotlin.payment.application.service

data class PaymentRequest(
    val orderId: Long,
    val cardNumber: String
) {
    init {
        require(cardNumber.isNotBlank()) { "카드 번호는 필수입니다." }
    }
}
