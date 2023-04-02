package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
 
	@Autowired
	private CourseService courseService;
	
	 
	
	@GetMapping("/home")
	public String home() {
		return "welcome to courses application";
	}
	
//get the courses	-
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	 {
		return this.courseService.getCourses();
	}
	
	//single course get
	@GetMapping ("/courses/{coursesId}")
	public Course getCourse(@PathVariable String coursesId) {
		
		 return this.courseService.getCourse(Long.parseLong(coursesId));
	}
	 
	
	//course add

	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.add(course);
	}
	
	//Update course using PUT request 
	 @PutMapping("/course")
	public  Course updateCourse(@RequestBody Course course) {
		 return this.courseService.updateCourse(course);
	 }
	
	
}

