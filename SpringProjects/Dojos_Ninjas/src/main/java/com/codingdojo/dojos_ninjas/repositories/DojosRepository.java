package com.codingdojo.dojos_ninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojos_ninjas.models.Dojos;

public interface DojosRepository extends CrudRepository<Dojos, Long>{
	List<Dojos> findAll();
}
