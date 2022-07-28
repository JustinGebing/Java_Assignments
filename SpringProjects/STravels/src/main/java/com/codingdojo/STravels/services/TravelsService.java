package com.codingdojo.STravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.STravels.models.Travels;
import com.codingdojo.STravels.repositories.TravelRepository;



@Service
public class TravelsService {
	
	private final TravelRepository travelrepository;
	
	public TravelsService(TravelRepository travelrepository) {
		this.travelrepository = travelrepository;
	}
	
	public List<Travels> allTravels() {
		return travelrepository.findAll();
	}
	
	public Travels createTravel(Travels t) {
		return travelrepository.save(t);
	}
	
	public Travels updateTravel(Travels t) {
		return travelrepository.save(t);
	}
	
	public Travels findTravels(Long id) {
		Optional<Travels> optionalTravel = travelrepository.findById(id);
		if(optionalTravel.isPresent()) {
			return optionalTravel.get();
		} else {
			return null;
		}
	}
	public void deleteTravels(Long id) {
		Optional<Travels> optionalTravel = travelrepository.findById(id);
		if(optionalTravel.isPresent()) {
			travelrepository.deleteById(id);
		}
	}
}
