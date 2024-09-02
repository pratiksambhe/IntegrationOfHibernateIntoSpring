package com.CompleteSpring.Dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CompleteSpring.Entity.Mobile;
import com.mysql.cj.xdevapi.SessionFactory;

import jakarta.websocket.server.PathParam;

@Repository
public class MobileDao {
@Autowired
org.hibernate.SessionFactory factory;

public Mobile fechMobileDetailbyId(int id) {
	Session openSession = factory.openSession();
	Mobile mobile=openSession.get(Mobile.class, id);
	System.out.println(mobile);
	return mobile;
}


public void addMobile(Mobile mobile) {
	Session openSession = factory.openSession();

	openSession.save(mobile);
	openSession.beginTransaction().commit();
	openSession.close();
}
public void updateMobileDetailsbyId( int id,Mobile mobile) {
	Session openSession = factory.openSession();
    	if(openSession.get(Mobile.class, id)!=null) {

	openSession.update(mobile);}
	openSession.beginTransaction().commit();
	openSession.close();
	
}
public void deleteMobileDetails( int id) {
	Session openSession = factory.openSession();
	Mobile mobile=openSession.get(Mobile.class, id);

		
		openSession.delete(mobile);
	openSession.beginTransaction().commit();
	openSession.close();
	
}

}
