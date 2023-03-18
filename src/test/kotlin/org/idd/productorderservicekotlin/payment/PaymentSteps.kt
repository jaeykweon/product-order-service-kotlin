package org.idd.productorderservicekotlin.payment

import io.restassured.RestAssured
import io.restassured.response.ExtractableResponse
import io.restassured.response.Response
import org.idd.productorderservicekotlin.payment.application.service.PaymentRequest
import org.springframework.http.MediaType

class PaymentSteps {
    companion object {
        @JvmStatic
        fun 주문결제요청_생성(): PaymentRequest {
            val orderId = 1L
            val cardNumber = "1234-1234-1234-1234"
            return PaymentRequest(orderId, cardNumber)
        }

        @JvmStatic
        fun 주문결제요청(request: PaymentRequest): ExtractableResponse<Response> {
            return RestAssured.given().log().all()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(request)
                .`when`()
                .post("/payments")
                .then().log().all()
                .extract()
        }
    }
}
