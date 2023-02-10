package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.cruddemo.entity.Participante;
import com.luv2code.springboot.cruddemo.service.ParticipanteService;

@RestController
@RequestMapping("/api")
public class ParticipanteRestController {

	private ParticipanteService participanteService;
	
	@Autowired
	public ParticipanteRestController(ParticipanteService theParticipanteService) {
		participanteService = theParticipanteService;
	}
	
	// expose "/employees" and return list of employees
	@GetMapping("/participantes")
	public List<Participante> findAll() {
		return participanteService.findAll();
	}

	// add mapping for GET /employees/{employeeId}
	
	@GetMapping("/participantes/{participanteId}")
	public Participante getParticipante(@PathVariable int participanteId) {
		
		Participante theParticipante = participanteService.findById(participanteId);
		
		if (theParticipante == null) {
			throw new ParticipanteNotFoundException("Participante id not found - " + participanteId);
		}
		
		return theParticipante;
	}
	
	// add mapping for POST /employees - add new employee
	
	@PostMapping("/participantes")
	public Participante addParticipante(@RequestBody Participante theParticipante) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theParticipante.setId(0);
		
		participanteService.save(theParticipante);
		
		return theParticipante;
	}
	
	// add mapping for PUT /employees - update existing employee
	
	@PutMapping("/participantes")
	public Participante updateParticipante(@RequestBody Participante theParticipante) {
		
		participanteService.save(theParticipante);
		
		return theParticipante;
	}
	
	// add mapping for DELETE /employees/{employeeId} - delete employee
	
	@DeleteMapping("/participantes/{participanteId}")
	public String deleteParticipante(@PathVariable int participanteId) {
		
		Participante tempParticipante = participanteService.findById(participanteId);
		
		// throw exception if null
		
		if (tempParticipante == null) {
			throw new ParticipanteNotFoundException("Participante id not found - " + participanteId);
		}
		
		participanteService.deleteById(participanteId);
		
		return "Deleted participante id - " + participanteId;
	}
	
}










