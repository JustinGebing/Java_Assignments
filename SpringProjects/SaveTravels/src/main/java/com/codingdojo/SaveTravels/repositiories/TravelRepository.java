package com.codingdojo.SaveTravels.repositiories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.SaveTravels.models.Travels;

@Repository
public interface TravelRepository extends CrudRepository<Travels, Long>{
	List<Travels> findAll();
}
