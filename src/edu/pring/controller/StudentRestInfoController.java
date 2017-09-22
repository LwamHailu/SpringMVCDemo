package edu.pring.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.pring.domain.Student;
@RestController
public class StudentRestInfoController {
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	//@ResponseBody can be avoided in @RestController Annotation 
	public  ArrayList<Student> getStudentList() {
		ArrayList<Student> students = new ArrayList<Student>();
		Student stud1 = new Student();
		stud1.setName("Lwam");
		stud1.setHobby("Football");
		stud1.setPhoneNumber(272363626);
		stud1.setDateBirth(new Date());

		Student stud2 = new Student();
		stud2.setName("adu");
		stud2.setHobby("bollyball");
		stud2.setPhoneNumber(272363626);
		stud2.setDateBirth(new Date());

		Student stud3 = new Student();
		stud3.setName("febu");
	//	stud3.setHobby("music");
		stud3.setPhoneNumber(272363626);
		stud3.setDateBirth(new Date());

		students.add(stud1);
		students.add(stud2);
		students.add(stud3);

				return students;
	}
}
