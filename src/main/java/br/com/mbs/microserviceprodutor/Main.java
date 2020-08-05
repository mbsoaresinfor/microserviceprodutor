package br.com.mbs.microserviceprodutor;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		SpringApplication.run(Main.class, args);
	}
	
	@RequestMapping(value = "/meuNome", method = RequestMethod.GET)	 
	  public String meuNome() {
	    return "marcelo soares";
	  }

}
