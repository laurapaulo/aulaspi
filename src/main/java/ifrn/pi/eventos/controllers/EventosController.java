package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventosController {
	
	@RequestMapping ("/eventos/form")
	public String form() {
		return "formEvento";	
	}
	
	@RequestMapping(value= "/eventos/form",  method = RequestMethod.POST)
	public String envioForm(String nome, String local, String data, String horario) {
		System.out.println(nome + local + data + horario);
		return "formularioEnviado";
		
	}
	
	

}
