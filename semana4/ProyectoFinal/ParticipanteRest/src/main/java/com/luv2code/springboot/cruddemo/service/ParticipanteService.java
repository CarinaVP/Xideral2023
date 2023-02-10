package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import com.luv2code.springboot.cruddemo.entity.Participante;

public interface ParticipanteService {

	public List<Participante> findAll();
	
	public Participante findById(int theId);
	
	public void save(Participante theParticipante);
	
	public void deleteById(int theId);
	
}
