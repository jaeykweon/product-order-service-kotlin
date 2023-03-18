package org.idd.productorderservicekotlin.product

import io.kotest.matchers.shouldBe
import org.idd.productorderservicekotlin.product.application.service.GetProductResponse
import org.idd.productorderservicekotlin.product.application.service.ProductService
import org.idd.productorderservicekotlin.product.application.service.UpdateProductRequest
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.ResponseEntity

@SpringBootTest
class ProductServiceTest {

    @Autowired
    lateinit var productService: ProductService

    @Test
    fun 상품수정() {
        productService.addProduct(ProductSteps.상품등록요청_생성())
        val productId = 1L
        val request: UpdateProductRequest = ProductSteps.상품수정요청_생성()

        productService.updateProduct(productId, request)

        val response: ResponseEntity<GetProductResponse> = productService.getProduct(productId)
        val productResponse: GetProductResponse = response.body!!
        productResponse.name shouldBe "상품 수정"
        productResponse.price shouldBe 2000
    }
}
