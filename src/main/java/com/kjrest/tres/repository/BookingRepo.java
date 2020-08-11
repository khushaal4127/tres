package com.kjrest.tres.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kjrest.tres.entity.Bookingtable;

public interface BookingRepo extends JpaRepository<Bookingtable,Integer>{

	public List<Bookingtable> findByUserUserId(int id);
}

