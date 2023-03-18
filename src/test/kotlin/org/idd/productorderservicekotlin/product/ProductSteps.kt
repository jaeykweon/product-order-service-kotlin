package org.idd.productorderservicekotlin.product

import io.restassured.RestAssured
import io.restassured.response.ExtractableResponse
import io.restassured.response.Response
import org.idd.productorderservicekotlin.product.application.service.AddProductRequest
import org.idd.productorderservicekotlin.product.application.service.UpdateProductRequest
import org.idd.productorderservicekotlin.product.domain.DiscountPolicy
import org.springframework.http.MediaType

class ProductSteps {
    companion object {
        fun 상품등록요청(request: AddProductRequest): ExtractableResponse<Response> {
            return RestAssured.given().log().all()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(request)
                .`when`()
                .post("/products")
                .then()
                .log().all().extract()
        }

        fun 상품등록요청_생성(): AddProductRequest {
            val name = "상품명"
            val price = 1000
            val discountPolicy: DiscountPolicy = DiscountPolicy.NONE
            return AddProductRequest(name, price, discountPolicy)
        }

        fun 상품조회요청(productId: Long): ExtractableResponse<Response> {
            return RestAssured.given().log().all()
                .`when`()["/products/{productId}", productId]
                .then().log().all()
                .extract()
        }

        fun 상품수정요청_생성(): UpdateProductRequest {
            return UpdateProductRequest("상품 수정", 2000, DiscountPolicy.NONE)
        }

        fun 상품수정요청(productId: Long): ExtractableResponse<Response> {
            return RestAssured.given().log().all()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(상품수정요청_생성())
                .`when`()
                .patch("/products/{productId}", productId)
                .then().log().all()
                .extract()
        }
    }
}
