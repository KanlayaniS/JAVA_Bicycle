package com.cp.bicycleService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.entity.MyBicycleList;
import com.cp.repository.MyBiRepository;

@Service
public class MyBicycleListService {

	// two interface

	@Autowired
	private MyBiRepository mybi;

	// savemyBike
	public void saveMyBicycles(MyBicycleList bicyclesL) {
		mybi.save(bicyclesL);

	}

	public List<MyBicycleList> getAllMyBicycles() {
		return mybi.findAll();

	}

	public void deleteById(int id) {
		mybi.deleteById(id);

	}

}
