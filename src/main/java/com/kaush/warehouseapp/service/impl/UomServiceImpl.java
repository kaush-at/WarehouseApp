package com.kaush.warehouseapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaush.warehouseapp.model.Uom;
import com.kaush.warehouseapp.repo.UomRepo;
import com.kaush.warehouseapp.service.IUomService;

@Service
public class UomServiceImpl implements IUomService {

	@Autowired
	private UomRepo uomRepo;
	
	@Override
	public Integer saveUom(Uom uom) {
		Uom savedUom = uomRepo.save(uom);
		return savedUom.getId();
	}

	@Override
	public List<Uom> getAllUoms() {
		List<Uom> uomList = uomRepo.findAll();
		return uomList;
	}

}
