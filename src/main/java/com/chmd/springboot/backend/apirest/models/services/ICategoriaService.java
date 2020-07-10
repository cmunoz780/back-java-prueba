package com.chmd.springboot.backend.apirest.models.services;

import java.util.List;

import com.chmd.springboot.backend.apirest.models.entity.Categoria;

public interface ICategoriaService {

	public List<Categoria> findAll();
}
