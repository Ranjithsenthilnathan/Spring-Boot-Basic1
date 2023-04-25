package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.AppModel;
import com.example.app.repository.AppRepository;

@RestController
public class AppController
{
	@Autowired
	AppRepository ar;
	@GetMapping("/app")
	public List<AppModel> getAllDetails()
	{
		return ar.findAll();
	}
	@PostMapping("/login")
	public AppModel saveInfo(@RequestBody AppModel id)
	{
		return ar.save(id);
	}
	@GetMapping("/lo/{id}")
	public String getDeatailsById(@PathVariable int id)
	{
		ar.findById(id);
		return "Details Displayed";		
	}
	@DeleteMapping("/lo/{id}")
	public String deleteDetailsById(@PathVariable int id)
	{
		ar.deleteById(id);
		return "Details Deleted";
	}
	@PutMapping("/login")
	public AppModel getDeatailsById2(@RequestBody AppModel id)
	{
		return ar.save(id);	
	}
}
