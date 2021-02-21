package com.kaush.warehouseapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaush.warehouseapp.model.OrderMethod;

public interface OrderMethodRepo extends JpaRepository<OrderMethod, Integer> {

}
