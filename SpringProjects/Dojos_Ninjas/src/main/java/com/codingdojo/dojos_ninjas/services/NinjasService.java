package com.codingdojo.dojos_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.codingdojo.dojos_ninjas.models.Ninjas;
import com.codingdojo.dojos_ninjas.repositories.NinjasRepository;

@Service
public class NinjasService {
	@Autowired
	NinjasRepository ninjasrepository;
	
	public List<Ninjas> allNinjas() {
		return ninjasrepository.findAll();
	}
	
	public Ninjas createNinjas(Ninjas ninjas) {
		return ninjasrepository.save(ninjas);
	}
	
	public Ninjas findNinjas(Long id) {
		Optional<Ninjas> optionalNinjas = ninjasrepository.findById(id);
		if (optionalNinjas.isPresent()){
			return optionalNinjas.get();
		} else {
			return null;
		}
}
}
