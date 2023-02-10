package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.ParticipanteDAO;
import com.luv2code.springboot.cruddemo.entity.Participante;

@Service
public class ParticipanteServiceImpl implements ParticipanteService {

	private ParticipanteDAO participanteDAO;
	
	@Autowired
	public ParticipanteServiceImpl(ParticipanteDAO theParticipanteDAO) {
		participanteDAO = theParticipanteDAO;
	}
	
	@Override
	@Transactional
	public List<Participante> findAll() {
		return participanteDAO.findAll();
	}

	@Override
	@Transactional
	public Participante findById(int theId) {
		return participanteDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Participante theParticipante) {
		participanteDAO.save(theParticipante);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		participanteDAO.deleteById(theId);
	}

}






