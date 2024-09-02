package com.CompleteSpring.Service;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.CompleteSpring.Dao.MobileDao;
import com.CompleteSpring.Entity.Mobile;

import jakarta.websocket.server.PathParam;
@Service
public class MobileService {

@Autowired
MobileDao dao;

public Mobile fechMobileDetailbyId(int id) {
		Mobile mobile=dao.fechMobileDetailbyId(id);
	return mobile;
}
public void addMobile(Mobile mobile) {
	dao.addMobile(mobile);
	
}

public void updateMobileDetailsbyId(int id,Mobile mobile) {
	dao.updateMobileDetailsbyId(id,mobile);
	
}
public void deleteMobileDetails(int id) {
	dao.deleteMobileDetails(id);
	
}
}
