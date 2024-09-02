package com.HibernateConnection.ClassroomService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HibernateConnection.ClassroomDao.ClassroomDao;
import com.HibernateConnection.Entity.Classroom;
@Service
public class ClassroomService {
	@Autowired
	ClassroomDao classroomDao;
	public List<Classroom> fetchallClasses() {
		    List<Classroom> fetchallClasses = classroomDao.fetchallClasses();
		    return fetchallClasses;
	}
}
