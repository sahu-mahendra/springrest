package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public  class CourseServiceImp implements CourseService {

	List<Course> list;

	public CourseServiceImp() {

		list = new ArrayList<>();

		list.add(new Course(145, "java core course", "this course contain basics of java"));
		list.add(new Course(4525, "spring boot coourse", "creating rest api using spring boot"));
	}

	@Override
	public List<Course> getCourses() {

		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for (Course courses : list) {
			if (courses.getId() == courseId) {
				c = courses;
				break;
			}
		}
		return c;
	}

	@Override
	public Course add(Course course) {
		list.add(course);
		return course;
	}

	@Override
	
		public Course updateCourse(Course course) {
			list.forEach(e -> {

				if (e.getId() == course.getId()) {
					e.setTitle(course.getTitle());
					e.setDescription(course.getDescription());
				}

			});
			return course;
		}

	@Override
	public Course update(Course course) {
		// TODO Auto-generated method stub
		return null;
	}


		
	}





	

