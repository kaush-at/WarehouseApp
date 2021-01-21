package com.kaush.warehouseapp.service;

import java.util.List;

import com.kaush.warehouseapp.model.ShipmentType;

public interface IShipmentTypeService {
	
	Integer saveShipmentType(ShipmentType shipmentType);
	List<ShipmentType> getAllShipmentTypes();
	
}
