package com.example.springtransaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springtransaction.model.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {

}
