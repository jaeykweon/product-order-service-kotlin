package org.idd.productorderservicekotlin.product.adapter

import org.idd.productorderservicekotlin.product.domain.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long>
