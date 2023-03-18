package org.idd.productorderservicekotlin.order

import io.kotest.matchers.shouldBe
import org.idd.productorderservicekotlin.ApiTest
import org.idd.productorderservicekotlin.product.ProductSteps
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus

class OrderApiTest : ApiTest() {

    @Test
    fun 상품주문() {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성())
        val request = OrderSteps.상품주문요청_생성()

        val response = OrderSteps.상품주문요청(request)

        response.statusCode() shouldBe HttpStatus.CREATED.value()
    }
}
