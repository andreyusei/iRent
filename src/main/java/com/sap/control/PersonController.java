package com.sap.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sap.model.Person;

@Controller
public class PersonController {

	@RequestMapping("/addPerson")
	public String addPersonURL(){
		return "addPerson";
	}
	
//	@RequestMapping("/addPerson")
//	public ModelAndView registra(Person person){
//		
//		//confirma-registro is the .jsp file that is going to be displayed 
// 		ModelAndView mv = new ModelAndView("addPerson");
//		mv.addObject("person", person);
//		
//		//System.out.println(produto.getNome() + " - " + produto.getValor());
//
//		return mv;
//	}
}

