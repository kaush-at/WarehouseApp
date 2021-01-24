package com.kaush.warehouseapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kaush.warehouseapp.service.IUomTypeService;

@Controller
@RequestMapping("/uom")
public class UomController {

	@Autowired
	private IUomTypeService uomService;
	
	@GetMapping("/register")
	public String showReg() {
		return "uomRegister";
	}
	
}
