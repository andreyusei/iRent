package com.sap.control;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sap.model.Christmas;

@Controller
public class ChristmasController {
	
	Calendar calendar = Calendar.getInstance();
	
	@RequestMapping("/christmas")
	public ModelAndView christmas(Christmas christmas){
		
		if(calendar.MONTH==12 && calendar.DAY_OF_MONTH==25){
			ModelAndView mv = new ModelAndView("checkChristmasY");
			return mv;
		}else{
			ModelAndView mv = new ModelAndView("checkChristmasN");
			return mv;
		}	
	}
}

