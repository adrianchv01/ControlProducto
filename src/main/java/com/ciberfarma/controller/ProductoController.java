package com.ciberfarma.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ciberfarma.model.Producto;
import com.ciberfarma.service.ProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	private ProductoService servicio;
	
	@GetMapping({"/","/cargar"})
	public String cargarPagCrud(Model model) {
		model.addAttribute("mensaje","Hola mundo");
		model.addAttribute("cssmensaje","alert alert-success");
		model.addAttribute("producto",new Producto());
		//list
		model.addAttribute("listaCat",servicio.listCat());
		model.addAttribute("listaProd",servicio.listProd());
		model.addAttribute("listaProv",servicio.listProv());
		return "crudproductos";
	}
	
	@PostMapping({"/grabar"})
	public String grabarPagCrud(@ModelAttribute Producto producto, Model model) {
		model.addAttribute("mensaje","Grabando: " + producto);
		model.addAttribute("cssmensaje","alert alert-success");
		model.addAttribute("producto",new Producto());
		return "crudproductos";
		
	}

}
