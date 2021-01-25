package com.kaush.warehouseapp.service;

import java.util.List;

import com.kaush.warehouseapp.model.Uom;

public interface IUomService {

	Integer saveUom(Uom uom);

	List<Uom> getAllUoms();

}
