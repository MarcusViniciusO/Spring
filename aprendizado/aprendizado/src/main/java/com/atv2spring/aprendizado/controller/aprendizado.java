package com.atv2spring.aprendizado.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/atv2")
public class aprendizado {
	@GetMapping
	public String atv2()
	{
		return "Quero aprender Spring-Boot!!!";
	}

}
