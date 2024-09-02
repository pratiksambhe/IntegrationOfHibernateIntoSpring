package com.CompleteSpring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CompleteSpring.Entity.Mobile;
import com.CompleteSpring.Service.MobileService;

import jakarta.websocket.server.PathParam;
@RestController
public class MobileController {
	
	//@PathVariable
	
	
	@Autowired
	MobileService mobileService;
	@GetMapping("fechMobileDetailbyId/{id}")
	public Mobile fechMobileDetailbyId(@PathVariable("id") int  id) {
		Mobile mobile=mobileService.fechMobileDetailbyId(id);
	return mobile;
}
	
	//@PathParam
	
	
	@Qualifier("d")
	@GetMapping("fechSingleMobileDetailbyId")
	public Mobile fechSingleMobileDetailbyId(@PathParam(value="id") int  id) {
		Mobile mobile=mobileService.fechMobileDetailbyId(id);
		
		return mobile;
	}
	
	
	//@RequestBody
	
	
	@Qualifier("d")
	@PostMapping("addMobile")
	public void addMobile(@RequestBody Mobile mobile) {
		mobileService.addMobile(mobile);

	}
	
	
	@PutMapping("updateMobileDetailsbyId/{id}")
	public void updateMobileDetailsbyId(@PathVariable("id") int id,@RequestBody Mobile mobile) {
		mobileService.updateMobileDetailsbyId(id, mobile);
		
	}
	@DeleteMapping("deleteMobileDetails/{id}")
	public void deleteMobileDetails(@PathVariable("id") int id) {
		mobileService.deleteMobileDetails(id);
		
	}
	
	
	
	
	
}
