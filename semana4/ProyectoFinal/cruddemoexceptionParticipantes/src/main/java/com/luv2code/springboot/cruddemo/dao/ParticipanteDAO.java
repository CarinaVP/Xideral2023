package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import com.luv2code.springboot.cruddemo.entity.Participante;

public interface ParticipanteDAO {

	public List<Participante> findAll();
	
	public Participante findById(int theId);
	
	public void save(Participante theParticipante);
	
	public void deleteById(int theId);
	
}
