package com.example.springtransaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springtransaction.model.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {

}
