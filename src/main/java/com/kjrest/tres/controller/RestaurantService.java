package com.kjrest.tres.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kjrest.tres.entity.Restaurant1;
import com.kjrest.tres.repository.RestRepo;

@Service
public class RestaurantService {
	@Autowired
	private RestRepo restRepo;
	
	public List<Restaurant1> getAllRests() {
		List<Restaurant1> rarray = new ArrayList<>();
		 restRepo.findAll()
		 .forEach(rarray::add);
		 return rarray;
		
	}
	
	public void addRest(Restaurant1 restr) {
		restRepo.save(restr);
	}
	
	public void updateRest(int rest_in,Restaurant1 restr) {
		restRepo.save(restr);
	}
	
	public void deleteRest(int rest_in) {
		restRepo.deleteById(rest_in);
	}

}
