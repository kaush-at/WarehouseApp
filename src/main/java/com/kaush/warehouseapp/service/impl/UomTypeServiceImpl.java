package com.kaush.warehouseapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaush.warehouseapp.model.Uom;
import com.kaush.warehouseapp.repo.UomRepo;
import com.kaush.warehouseapp.service.IUomTypeService;

@Service
public class UomTypeServiceImpl implements IUomTypeService {

	@Autowired
	private UomRepo uomRepo;
	
	@Override
	public void saveUom(Uom uom) {
		uomRepo.save(uom);
	}

}
