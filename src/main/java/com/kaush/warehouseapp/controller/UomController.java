package com.kaush.warehouseapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/delete")
	public String deleteUomById(@RequestParam("id") Integer uId, Model model) {
		
		boolean uomExistById = uomService.isUomExistById(uId);
		if(uomExistById) {
			uomService.deleteUomById(uId);
			model.addAttribute("message", "Uom " + uId + " deleted");
		}else {
			model.addAttribute("ErrMessage", "Uom " + uId + " cannot found");
		}
		
		model.addAttribute("uomList", uomService.getAllUoms());
		return "uomData";
	}
	
	@GetMapping("/edit")
	public String editUom(@RequestParam("id") Integer uomId, Model model) {
		
		String page = null;
		
		Optional<Uom> uom = uomService.findUomById(uomId);
		if(uom.isPresent()) {
			model.addAttribute("uom", uom.get());
			page = "uomEdit";
		}else {
			model.addAttribute("ErrMessage", "Uom not found by id :"+uomId);
			page =  "uomData";
		}
		
		return page;
	}
	
	@PostMapping("/update")
	public String doUpdateUom(@ModelAttribute Uom uom, Model model) {
		
		Integer updatedId = uomService.updateUom(uom);
		model.addAttribute("message", "Uom "+updatedId+" updated..!");
		
		List<Uom> uomList = uomService.getAllUoms();
		model.addAttribute("uomList", uomList);
		
		return "uomData";
		
	}
	
}
