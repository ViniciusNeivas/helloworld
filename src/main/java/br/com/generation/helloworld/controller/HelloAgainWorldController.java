package br.com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/HelloAgainWorld")
public class HelloAgainWorldController {

	@GetMapping
	public String HelloAgain() {
		return "Hello Again";
		
	}

	@GetMapping ("/bsm")
	public String bsm() {
		return "Mentalidades:\nPersistência\nOrientação ao futuro\nResponsabilidade pessoal\nMentalidade de crescimento\n"
				+ "Habilidades:"+"\nTrabalho em equipe\nAtenção ao detalhe\nProatividade\nComunicação";
		
	}

	@GetMapping ("/aprenderei")
	public String melhorias() {
		return "Objetivos de Aprendizagem da Semana\n\nGestão de tempo\nAtenção aos detalhes\nMelhorar na comunicação";
		
		
	}
	
}
