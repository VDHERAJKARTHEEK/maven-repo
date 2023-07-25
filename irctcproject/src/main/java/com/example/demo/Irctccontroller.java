package com.example.demo;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequestMapping("/irctc")
public class Irctccontroller {
		
	@Autowired
	Datarepo repo;
	
	//fetch all data
	@GetMapping("/tickets")
	public List<Tickets> alldata(){
		ArrayList <Tickets> ticketdata = new ArrayList<Tickets>();
		
		for(Tickets ticket:ticketdata) {
		System.out.println(ticket);
		}
		return repo.findAll();
	}
	
	
	@PostMapping("/tickets")
	public Tickets createticket (@RequestBody Tickets tickets) {
		return repo.save(tickets);
				
	} 
	
	@GetMapping("/tickets/{ticketno}")
	@SuppressWarnings("deprecation")
	public ResponseEntity getdataTickets(@PathVariable Integer ticketno) {
	
		Tickets data=repo.findById(ticketno).orElse(new Tickets());
	
	return ResponseEntity.ok(data);
	}
	@PutMapping("/tickets/{ticketno}")
	public ResponseEntity<Tickets> updateTickets(@PathVariable Integer ticketno,@RequestBody Tickets tickets){
		Tickets data=repo.findById(ticketno).orElse(new Tickets());
		
		data.setAge(tickets.getAge());
		data.setFirstname(tickets.getFirstname());
		data.setGender(tickets.getGender());
		data.setLastname(tickets.getLastname());
		
	Tickets updatedTickets = repo.save(tickets);
		return ResponseEntity.ok(updatedTickets);
	}
	
	//delete tickets
	@DeleteMapping("/tickets/{ticketno}")
	public ResponseEntity < Map < String, Boolean >> deleteTicket(@PathVariable Integer ticketno ){
		
		Tickets data=repo.findById(ticketno).orElse(new Tickets());
		repo.delete(data);
		Map < String, Boolean > response = new HashMap<> ();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
		
		
	}
	}
	

