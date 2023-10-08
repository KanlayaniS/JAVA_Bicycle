package com.cp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cp.entity.MyBicycleList;

@Repository
public interface MyBiRepository extends JpaRepository<MyBicycleList, Integer> {
	
	

}
