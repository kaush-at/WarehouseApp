package com.kaush.warehouseapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kaush.warehouseapp.model.ShipmentType;
import com.kaush.warehouseapp.service.IShipmentTypeService;

@Controller
@RequestMapping("/st")
public class ShipmentTypeController {
	
	@Autowired
	IShipmentTypeService shipTypeService;

	@GetMapping("/register")
	public String showReg() {
		return "ShipmentTypeRegister";
	}
	
	@PostMapping("/save")
	public String saveShipmentType(@ModelAttribute ShipmentType shipmentType, Model model) {
		
		Integer id = shipTypeService.saveShipmentType(shipmentType);
		String message = "Shipment type saved with id "+id;
		model.addAttribute("message", message);
		
		return "ShipmentTypeRegister";
	}
	
	@GetMapping("/all")
	public String showAllShipmentTypes(Model model) {
		List<ShipmentType> allShipmentTypes = shipTypeService.getAllShipmentTypes();
		model.addAttribute("shipmentTypesList", allShipmentTypes );
		return "shipmentTypeData";
	}
	
}
