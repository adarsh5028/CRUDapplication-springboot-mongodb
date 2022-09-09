package com.spring.mongo.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.api.model.Bus;
import com.spring.mongo.api.repository.BusRepository;

@RestController
public class BusController {
	
	@Autowired
	private BusRepository repository;
	
	
	@PostMapping("/addBus")
	public String confirmBus(@RequestBody Bus bus) {
		repository.save(bus);
		return "Confirmed Bus with id :" + bus.getId();
	}
	
	@GetMapping("/findAllBuses")
	public List<Bus> getBuses(){
		return repository.findAll();
		 
	}
	@GetMapping("/findAllBuses/{id}")
	  public Optional<Bus> getBus(@PathVariable int id){
		  return repository.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String CancelBus(@PathVariable int id) {
		repository.deleteById(id);
		return "CANCEL BUS ID IS :"+id;
	}

	
}
