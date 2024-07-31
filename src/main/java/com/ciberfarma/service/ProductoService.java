package com.ciberfarma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciberfarma.model.Categoria;
import com.ciberfarma.model.Producto;
import com.ciberfarma.model.Proveedor;
import com.ciberfarma.repository.ICategoriaRepository;
import com.ciberfarma.repository.IProductoRepository;
import com.ciberfarma.repository.IProveedorRepository;

@Service
public class ProductoService {
	
	//Repositorios a utilizar
	@Autowired
	private IProductoRepository repoProd;
	@Autowired
	private IProveedorRepository repoProv;
	@Autowired
	private ICategoriaRepository repoCat;
	
	public List<Categoria> listCat(){
		return repoCat.findAll();	
	}
	
	public List<Proveedor> listProv(){
		return repoProv.findAll();
	}
	
	public List<Producto> listProd(){
		return repoProd.findAll();
	}
	
	public Producto grabarProd(Producto p) {
		return repoProd.save(p);
	}

}
