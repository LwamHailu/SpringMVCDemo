package edu.pring.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import edu.pring.domain.Student;

@Controller
public class InfoController {

	@InitBinder
	public void intBin(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] { "phoneNumber" });

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getInformation() throws Exception {
		// Arithmetic_Exception
		String exceptionOccured = "";
		if (exceptionOccured.equalsIgnoreCase("Arithmetic_Exception")) {
			throw new ArithmeticException("Arithmetic Exception");

		}
		if (exceptionOccured.equalsIgnoreCase("Null_Pointer")) {
			throw new NullPointerException("Null Pointer Exception");

		}

		if (exceptionOccured.equalsIgnoreCase("IO_Exception")) {
			throw new IOException("IO Exception");

		}
		ModelAndView model = new ModelAndView("index");
		return model;
	}

	@ModelAttribute
	public void headDisplay(Model model) {
		model.addAttribute("info", "Registration form");

	}

	@RequestMapping(value = "/disInfo", method = RequestMethod.POST)
	public ModelAndView displayInformation(@Valid @ModelAttribute("stud") Student stud, BindingResult result) {

		// @RequestParam
		// @RequestParam Map<String,String>params
		// String name = params.get("name");
		// String hobby = params.get("hobby");

		if (result.hasErrors()) {
			return new ModelAndView("index");
		}

		ModelAndView model = new ModelAndView("dispalyInfo");
		// model.addObject("msg", "Name "+name + " Your Hobby is" + hobby);
		return model;
	}

	// @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	// @ExceptionHandler(value = Exception.class)
	// public String handleException(Exception e) {
	// return "exceptionPage";
	// }

	

}
