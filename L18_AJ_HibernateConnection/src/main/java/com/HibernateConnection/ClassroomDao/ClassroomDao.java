package com.HibernateConnection.ClassroomDao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.query.criteria.CriteriaDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.HibernateConnection.Entity.Classroom;
import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import com.tka.Mobile;

@Repository
public class ClassroomDao {
 
	@Autowired
	org.hibernate.SessionFactory factory;
	
	public List<Classroom> fetchallClasses() {
		List<Classroom> list=new ArrayList<Classroom>();
		org.hibernate.Session openSession = factory.openSession();
		   Classroom classroom = openSession.get(Classroom.class, 1);
		   list.add(classroom);
		return list;
	}
}
