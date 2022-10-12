package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.model.GeoFenceModel;

import com.example.requestobject.CreateGeofence;
import com.example.service.GeoFenceService;

@RestController
public class TestController {
	
	
	@Autowired
	private GeoFenceService geoFenceService;
	
	
	
	
	@GetMapping("/findgeofencedetails")
	public List<GeoFenceModel> findGeoFenceDetails(){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@ inside controller");
		
		
		
		return geoFenceService.getGeoFenceDetails();
	}
	
	@PostMapping("/insertvalue")
	public Boolean inserNewGeoFencevalue(@RequestBody CreateGeofence createGeofence) {
		
	 geoFenceService.updateGeofenceEntity(createGeofence);
		
		return true;
	}
    
	@PostMapping("/updatevalue")
	public Boolean updateGeoFenceDetails(@RequestBody CreateGeofence createGeofence) {
		geoFenceService.updateGeofenceIndividualValue(createGeofence);
		return true;
		
	}
	
	@PostMapping("/deletebyid")
	public String deleteGeoEntityDataById(@RequestParam String id ) {
		 System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@ inside controller"+ id);
		int a=geoFenceService.deleteGivenDetailsById(id);
		return "Given row has been deleted";
	}
	
}
