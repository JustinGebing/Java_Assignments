package com.codingdojo.dojos_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojos_ninjas.models.Dojos;
import com.codingdojo.dojos_ninjas.repositories.DojosRepository;

@Service
public class DojosService {
	@Autowired
	DojosRepository dojosrepository;
	
	public List<Dojos> allDojos() {
		return dojosrepository.findAll();
	}
	
	public Dojos createDojos(Dojos dojos) {
		return dojosrepository.save(dojos);
	}
	
	public Dojos findDojos(Long id) {
		Optional<Dojos> optionalDojos = dojosrepository.findById(id);
		if (optionalDojos.isPresent()){
			return optionalDojos.get();
		} else {
			return null;
		}
}
}
