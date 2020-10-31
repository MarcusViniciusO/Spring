package com.atv1spring.habiement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping ("/atv1")
@RestController
public class atv1 {
	
	@GetMapping
	public String Habilidade ()
	{
		return "Persistência e atenção aos detalhes";
	}
	

}
