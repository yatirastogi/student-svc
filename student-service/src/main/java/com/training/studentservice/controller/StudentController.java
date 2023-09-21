package com.training.studentservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.studentservice.model.Student;
import com.training.studentservice.repository.StudentRepository;

@RestController
@RequestMapping("/studapi")
public class StudentController {
	
	@Autowired
	StudentRepository repository;

	@GetMapping("/stud")
	public List<Student> getStud(){
//		List<Student> studList=new ArrayList();
//		studList.add(new Student("Raj",21,"A+"));
//		studList.add(new Student("Rajeev",21,"B+"));
//		studList.add(new Student("Rajesh",21,"A"));
//        return studList;
		
		return repository.findAll(); //use this to read from table
	}
	
	@PostMapping("/post")
	public void post(@RequestBody List<Student> stud) {
//		System.out.println(stud.getAge());
//		System.out.println(stud.getGrade());
//		System.out.println(stud.getStudName());

		repository.saveAll(stud);
	}
	
	@PostMapping("/stud")
	public Student getStud(@RequestBody long id) {
		Optional<Student> stud=repository.findById(id);
		
		if(stud.isPresent()) {
			return stud.get();
		}else {
			return null;
		}
	}
	
	
}
