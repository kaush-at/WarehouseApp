package com.kaush.warehouseapp.service.impl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public boolean isUomExistById(Integer id) {
		return uomRepo.existsById(id);
	}

	@Override
	public void deleteUomById(Integer id) {
		uomRepo.deleteById(id);
	}

	@Override
	public Optional<Uom> findUomById(Integer uomId) {
		return uomRepo.findById(uomId);
	}

	@Override
	public Integer updateUom(Uom uom) {
		Uom savedUom = uomRepo.save(uom);
		return savedUom.getId();
	}

}
