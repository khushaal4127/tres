package com.kjrest.tres.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kjrest.tres.entity.Bookingtable;


@RestController
@RequestMapping("/bookings")
public class BookingController {
	
	
	
	@Autowired
	private BookingService bookingService;
	
	@RequestMapping("/all")
	public List<Bookingtable> getAllBooks_(){
		return bookingService.getAllBooks();
	}
	
	@RequestMapping("/user/{id}/books")
	public List<Bookingtable> get_bookings_for_user_(@PathVariable int id){
	
		
		return bookingService.get_bookings_for_user(id);
	}
	
	@RequestMapping(method = RequestMethod.POST , value ="/add")
	public void addBook_(@RequestBody Bookingtable books){
		bookingService.addBook(books);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value="/update/{id}")
	public void updateBook_(@RequestBody Bookingtable books , @PathVariable int id){
		bookingService.updateBook(id,books);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value="/update/{id}")
	public void deleteBook_(@PathVariable int id){
		bookingService.deleteBook(id);
	}

}