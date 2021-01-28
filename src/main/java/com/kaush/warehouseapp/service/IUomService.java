package com.kaush.warehouseapp.service;

import java.util.List;
import java.util.Optional;

import com.kaush.warehouseapp.model.Uom;

public interface IUomService {

	Integer saveUom(Uom uom);

	List<Uom> getAllUoms();
	
	boolean isUomExistById(Integer id);
	
	void deleteUomById(Integer id);

	Optional<Uom> findUomById(Integer uomId);

	Integer updateUom(Uom uom);

}
