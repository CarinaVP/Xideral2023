package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.cruddemo.entity.Participante;
import com.luv2code.springboot.cruddemo.service.ParticipanteService;

@Controller
@RequestMapping("/mvc")
public class ParticipanteMvcController {

	// need to inject our customer service
	@Autowired
	private ParticipanteService participanteService;
	
	@GetMapping("/participantes")
	public String listParticipantes(Model theModel) {
		
		// get customers from the service
		List<Participante> theParticipantes = participanteService.findAll();
				
		// add the customers to the model
		theModel.addAttribute("participantes", theParticipantes);
		
		return "list-participantes";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Participante theParticipante = new Participante();
		
		theModel.addAttribute("participante", theParticipante);
		
		return "participante-form";
	}
	
	@PostMapping("/saveParticipante")
	public String saveParticipante(@ModelAttribute("participante") Participante theParticipante) {
		
		// save the customer using our service
		participanteService.save(theParticipante);	
		
		return "redirect:/mvc/participantes";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("participanteId") int theId,
									Model theModel) {
		
		// get the customer from our service
		Participante theParticipante = participanteService.findById(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("participante", theParticipante);
		
		// send over to our form		
		return "participante-form";
	}
	
	@GetMapping("/delete")
	public String deleteParticipante(@RequestParam("participanteId") int theId) {
		
		// delete the customer
		participanteService.deleteById(theId);
		
		return "redirect:/mvc/participantes";
	}

}










