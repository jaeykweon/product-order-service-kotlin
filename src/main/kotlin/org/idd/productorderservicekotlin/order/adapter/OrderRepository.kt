package org.idd.productorderservicekotlin.order.adapter

import org.idd.productorderservicekotlin.order.domain.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order, Long>
