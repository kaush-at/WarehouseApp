package com.kaush.warehouseapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaush.warehouseapp.model.Uom;

public interface UomTypeRepo extends JpaRepository<Uom, Integer> {

}
