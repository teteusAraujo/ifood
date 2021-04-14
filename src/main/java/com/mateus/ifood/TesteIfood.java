package com.mateus.ifood;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TesteIfood {
	
	@GetMapping
	public String testeIfood() {
		return "Testando a API do Ifood!!!!";
	}
}
