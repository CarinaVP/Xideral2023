package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Participante;

@Repository
public class ParticipanteDAOHibernateImpl implements ParticipanteDAO {

	// define field for entitymanager	
	private EntityManager entityManager;
		
	// set up constructor injection
	@Autowired
	public ParticipanteDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public List<Participante> findAll() {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// create a query
		Query<Participante> theQuery =
				currentSession.createQuery("from Participante", Participante.class);
		
		// execute query and get result list
		List<Participante> participantes = theQuery.getResultList();
		
		// return the results		
		return participantes;
	}


	@Override
	public Participante findById(int theId) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// get the employee
		Participante theParticipante =
				currentSession.get(Participante.class, theId);
		
		// return the employee
		return theParticipante;
	}


	@Override
	public void save(Participante theParticipante) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// save employee
		currentSession.saveOrUpdate(theParticipante);
	}


	@Override
	public void deleteById(int theId) {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
				
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery(
						"delete from Participante where id=:participanteId");
		theQuery.setParameter("participanteId", theId);
		
		theQuery.executeUpdate();
	}

}







