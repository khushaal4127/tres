package com.kjrest.tres.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kjrest.tres.entity.Restaurant1;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
	
	
	
	@Autowired
	private RestaurantService restaurantService;
	
	@RequestMapping("/all")
	public List<Restaurant1> getAllRests_(){
		return restaurantService.getAllRests();
	}
	
	@RequestMapping(method = RequestMethod.POST , value ="/add")
	public void addRest_(@RequestBody Restaurant1 restr){
		restaurantService.addRest(restr);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value="/update/{id}")
	public void updateRest_(@RequestBody Restaurant1 restr , @PathVariable int id){
		restaurantService.updateRest(id,restr);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value="/update/{id}")
	public void deleteRest_(@PathVariable int id){
		restaurantService.deleteRest(id);
	}
	

}
