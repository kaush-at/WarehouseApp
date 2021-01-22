package com.kaush.warehouseapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaush.warehouseapp.model.ShipmentType;
import com.kaush.warehouseapp.repo.ShipmentTypeRepo;
import com.kaush.warehouseapp.service.IShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {

	@Autowired
	private ShipmentTypeRepo shipTypeRepo;

	@Override
	public Integer saveShipmentType(ShipmentType shipmentType) {
		ShipmentType st = shipTypeRepo.save(shipmentType);
		return st.getId(); 
	}

	@Override
	public List<ShipmentType> getAllShipmentTypes() {
		List<ShipmentType> shipmentTypes = shipTypeRepo.findAll();
		return shipmentTypes;
	}

	@Override
	public boolean isShipTypeexistsById(Integer id) {
		return shipTypeRepo.existsById(id);
	}
	
	@Override
	public void deleteShipmentTypeById(Integer id) {
		shipTypeRepo.deleteById(id);		
	}
}
