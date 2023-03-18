package org.idd.productorderservicekotlin.payment.adapter

import org.idd.productorderservicekotlin.payment.domain.Payment
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository : JpaRepository<Payment, Long>
