package org.idd.productorderservicekotlin.payment

import io.kotest.matchers.shouldBe
import org.idd.productorderservicekotlin.ApiTest
import org.idd.productorderservicekotlin.order.OrderSteps
import org.idd.productorderservicekotlin.product.ProductSteps
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus

class PaymentApiTest : ApiTest() {

    @Test
    fun 주문결제() {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성())
        OrderSteps.상품주문요청(OrderSteps.상품주문요청_생성())
        val request = PaymentSteps.주문결제요청_생성()

        val response = PaymentSteps.주문결제요청(request)

        response.statusCode() shouldBe HttpStatus.OK.value()
    }
}
