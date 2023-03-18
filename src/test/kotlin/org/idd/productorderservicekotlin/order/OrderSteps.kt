package org.idd.productorderservicekotlin.order

import io.restassured.RestAssured
import io.restassured.response.ExtractableResponse
import io.restassured.response.Response
import org.idd.productorderservicekotlin.order.application.service.CreateOrderRequest
import org.springframework.http.MediaType

class OrderSteps {
    companion object {
        @JvmStatic
        fun 상품주문요청(request: CreateOrderRequest?): ExtractableResponse<Response> {
            return RestAssured.given().log().all()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(request)
                .`when`()
                .post("/orders")
                .then()
                .log().all().extract()
        }

        @JvmStatic
        fun 상품주문요청_생성(): CreateOrderRequest? {
            val productId = 1L
            val quantity = 2
            return CreateOrderRequest(productId, quantity)
        }
    }
}
