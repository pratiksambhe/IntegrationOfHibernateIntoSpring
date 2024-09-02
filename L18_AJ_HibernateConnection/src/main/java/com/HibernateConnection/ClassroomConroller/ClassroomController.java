package com.HibernateConnection.ClassroomConroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HibernateConnection.ClassroomDao.ClassroomDao;
import com.HibernateConnection.ClassroomService.ClassroomService;
import com.HibernateConnection.Entity.Classroom;
@RestController
public class ClassroomController {
	
	@Autowired
	ClassroomService classroomService;
	
	@GetMapping("fetchallClasses")
	public List<Classroom> fetchallClasses() {
		    List<Classroom> fetchallClasses = classroomService.fetchallClasses();
		    return fetchallClasses;
	}

}
