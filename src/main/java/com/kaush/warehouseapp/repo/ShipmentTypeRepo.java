package com.kaush.warehouseapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaush.warehouseapp.model.ShipmentType;

public interface ShipmentTypeRepo extends JpaRepository<ShipmentType, Integer> {

}
