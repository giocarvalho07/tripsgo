package com.example.tripsGo_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TripsGoController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/cadastro")
	public String cadastro() {
		return "login/cadastro";
	}
	
	@GetMapping("/cliente")
	public String cliente() {
		return "cliente/exibirCliente";
	}
	
	@GetMapping("/reserva")
	public String reserva(Model model) {
		int calculo = 2;
		double reserva = 45.99;
		model.addAttribute("mensagem", calculo * reserva);
		return "cliente/reservaHotel";
	}
	
	@GetMapping("/pagamento")
	public String pagamento() {
		return "cliente/cadastroPagamento";
	}
	
	@GetMapping("/pagamento-confirmado")
	public String pagamentoRealizado() {
		return "cliente/pagamentoRealizado";
	}
	
	@GetMapping("/administrador")
	public String administrador() {
		return "adm/cadastroAdm";
	}
	
	@GetMapping("/exibir-hotel")
	public String cadastrarHotel(Model model) {
		
		double price = 45.99;
		double priceX = 89.99;
		
		model.addAttribute("price", "45,99");
		model.addAttribute("priceX", "89,99");
		
		
		model.addAttribute("hotel", "Steve Hotel's");
		model.addAttribute("hotelX", "Just Trips");
		model.addAttribute("hotelY", "Summer Hotel's");
		model.addAttribute("hotelZ", "Bariloche S/A");
		return "adm/exibirAdm";
	}
	

}
