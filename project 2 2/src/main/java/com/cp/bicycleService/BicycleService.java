package com.cp.bicycleService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.entity.Bicycle;
import com.cp.repository.BicycleRepository;


@Service
public class BicycleService {
	
	@Autowired
	private BicycleRepository bRepo;
	
	
	public void save(Bicycle b) {
		
		bRepo.save(b);
		
	}
	
	// เพื่อให้คลาส controller สามารถ getAll ได้ 
	public List<Bicycle> getAllBicycle(){
		
		//findAll
		return bRepo.findAll();
	}
	// controller 
	public Bicycle getBiById(int id) {
		return bRepo.findById(id).get();
	}
	
	public void deleteById(int id) {
		bRepo.deleteById(id);
	}

}
