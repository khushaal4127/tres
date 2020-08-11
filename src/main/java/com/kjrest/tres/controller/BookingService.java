package com.kjrest.tres.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kjrest.tres.entity.Bookingtable;
import com.kjrest.tres.repository.BookingRepo;
import java.sql.Timestamp;
@Service
public class BookingService {
	
	@Autowired
	private BookingRepo bookRepo;
	
	public List<Bookingtable> getAllBooks() {
		List<Bookingtable> barray = new ArrayList<>();
		 bookRepo.findAll()
		 .forEach(barray::add);
		 return barray;
		
	}
	
	
	
	public void addBook(Bookingtable books) {
		
		List<Bookingtable> barray = new ArrayList<>();
		 bookRepo.findAll()
		 .forEach(barray::add);
		 
		 int c = 0;
		 for(int i = 0 ; i < barray.size();i++) {
			 Bookingtable b1 = barray.get(i);
			 
			 if(b1.getTableNo() == books.getTableNo() & b1.getRobj().getRestId() == books.getRobj().getRestId()) {
				 
				 if(books.getTimeIn().compareTo( b1.getTimeOut()) <0 & books.getTimeIn().compareTo( b1.getTimeIn()) >=0) {
					 c=1;
				 }
				 
				
			 }
		 }
		 
		if(c==0) { 
		bookRepo.save(books);
		}
		
		
	}
	
	public List<Bookingtable> get_bookings_for_user(int id){
		List<Bookingtable> barray = new ArrayList<>();
		bookRepo.findByUserUserId(id).forEach(barray::add);
		return barray;
	}
	
	
	
	
	public void updateBook(int user_id_in,Bookingtable books) {
		bookRepo.save(books);
	}
	
	public void deleteBook(int books_in) {
		bookRepo.deleteById(books_in);
	}

}
