package com.Rovshan.SiyahiApp.Controller;

import java.net.http.HttpRequest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rovshan.SiyahiApp.Model.Siyahi;
import com.Rovshan.SiyahiApp.Service.SiyahiService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class SiyahiController {

	@Autowired
	SiyahiService service;
	
	@GetMapping("/greet")
	public String greet (HttpServletRequest request) {
		
		System.out.println("Hello everyone ");
		return "Hello everyone "+ request.getSession().getId();
	}
	
	
	@GetMapping("/get")
	public List<Siyahi>getallSiyahi(){
		
		return  service.getallSiyahi();
	}
	
	@PostMapping("/post")
	public Siyahi postSiyahi(@RequestBody Siyahi siyahi){
		return service.postSiyahi(siyahi);
		
	}
	@GetMapping("/get/{id}") 
	public Siyahi getbyid(@PathVariable int id) {
		return service.getbyid(id);
		
	}
	
	
	@PutMapping("/put")
	public void putSiyahi(@RequestBody Siyahi id) {
		
		 service.putSiyahi(id);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteSiyahi(@PathVariable int id) {
		service.deleteSiyahi(id);
	}
	@GetMapping("/csrfToken")
	public CsrfToken csrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
}
