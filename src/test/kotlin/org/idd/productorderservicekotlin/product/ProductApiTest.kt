package org.idd.productorderservicekotlin.product

import io.kotest.matchers.shouldBe
import org.idd.productorderservicekotlin.ApiTest
import org.idd.productorderservicekotlin.product.adapter.ProductRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus

class ProductApiTest : ApiTest() {

    @Autowired
    lateinit var productRepository: ProductRepository

    @Test
    fun 상품등록() {
        val request = ProductSteps.상품등록요청_생성()

        val response = ProductSteps.상품등록요청(request)

        response.statusCode() shouldBe HttpStatus.CREATED.value()
    }

    @Test
    fun 상품조회() {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성())
        val productId = 1L

        val response = ProductSteps.상품조회요청(productId)

        response.statusCode() shouldBe HttpStatus.OK.value()
        response.jsonPath().getString("name") shouldBe "상품명"
    }

    @Test
    fun 상품수정() {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성())
        val productId = 1L

        val response = ProductSteps.상품수정요청(productId)

        response.statusCode() shouldBe HttpStatus.OK.value()
        productRepository.findByIdOrNull(1L)!!.name shouldBe "상품 수정"
    }
}
