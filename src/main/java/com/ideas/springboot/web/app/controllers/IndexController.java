package com.ideas.springboot.web.app.controllers;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ideas.springboot.web.app.models.Usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({"index","/"})
                       //Map<String, Object> map   
	public String index(Model model) {
	 model.addAttribute("titulo", "Hello Spring there i go");
	return "index";
}
	
	@GetMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Alejandra");
		usuario.setApellido("Martinez");
		usuario.setEmail("maoimp@hotmail.com");
		usuario.setEdad(35);
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario".concat(usuario.getNombre()));
		return "perfil";
	}  
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		
		/*List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Alejandra","Martinez","maoimp@hotmail.com",30));
		usuarios.add(new Usuario("Ivan","Mauricio","maoimp@hotmail.com",9));
		usuarios.add(new Usuario("Elsa","Peña","maoimp@hotmail.com",8));
		*/
		model.addAttribute("titulo", "Listados de usuarios");
		 
		return "listar";
		
			}
	
	@ModelAttribute("usuarios") 	
	public List<Usuario>  poblarUsuarios() {
	

		List<Usuario> usuarios = Arrays.asList(new Usuario("Alejandra","Martinez","maoimp@hotmail.com",30),
				new Usuario("Ivan","Mauricio","maoimp@hotmail.com",9),new Usuario("Elsa","Peña","maoimp@hotmail.com",8),
				new Usuario("Hais","Mach","Hais,,@hotmail.com",8));
	
	return usuarios;	
	}


}
