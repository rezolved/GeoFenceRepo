package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.model.GeoFenceModel;
import com.example.repository.GeoFenceRepository;
import com.example.requestobject.CreateGeofence;

@Service
public class GeoFenceService {
	
	@Autowired
	private GeoFenceRepository geoFenceRepository;
	
	public List<GeoFenceModel> getGeoFenceDetails(){
		
		
		return geoFenceRepository.getData();
	}
	public void updateGeofenceEntity(CreateGeofence createGeofence) {
		
		GeoFenceModel geoFenceModel=new GeoFenceModel();
		geoFenceModel.setID(createGeofence.getIdValue());
		geoFenceModel.setLatitude(createGeofence.getLatitude());
		geoFenceModel.setLongigtude(createGeofence.getLongitude());
		geoFenceModel.setName(createGeofence.getName());
		geoFenceModel.setRadius(createGeofence.getRadius());
		geoFenceRepository.save(geoFenceModel);
	}
   public void updateGeofenceIndividualValue(CreateGeofence createGeofence) {
	   //GeoFenceId gfId=new GeoFenceId(createGeofence.getId());
	  if(createGeofence.getIdValue()!=null) {
		  //update id
		   //System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ inside service its for updating id" +createGeofence.getName());
	   }
	   else if(createGeofence.getLatitude()!=null) {
		   //update latitude
		   System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ inside service its for updating lat" +createGeofence.getLatitude());
	   }
	   else if(createGeofence.getName()!=null) {
		   //update name
		   System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ inside service its for updating name" +createGeofence.getName());
	   }
	   
	   
   } 
   
   public int deleteGivenDetailsById(String ID) {
	 
	   return geoFenceRepository.deleteByGivenID(ID);
	   
   }
   
}
