package com.kaush.warehouseapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kaush.warehouseapp.model.Uom;
import com.kaush.warehouseapp.service.IUomService;

@Controller
@RequestMapping("/uom")
public class UomController {

	@Autowired
	private IUomService uomService;
	
	@GetMapping("/register")
	public String showReg() {
		return "uomRegister";
	}
	
	@PostMapping("/save")
	public String saveUom(@ModelAttribute Uom uom, Model model) {
		Integer uomId = uomService.saveUom(uom);
		model.addAttribute("uomId", "Uom "+uomId + " saved" );
		return "uomRegister";
	}
	
	@GetMapping("/all")
	public String getAllUom(Model model) {
		List<Uom> uomList  = uomService.getAllUoms();
		model.addAttribute("uomList", uomList);
		return "uomData";
	}
	
}
