package com.example.repository;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.example.model.GeoFenceModel;


public interface GeoFenceRepository extends CrudRepository<GeoFenceModel,String>{
	
	@Query(value = "SELECT * FROM public.geofence_details", nativeQuery = true)
	List<GeoFenceModel> getData();
	 
	
	
	
	@Transactional
	@Modifying
	@Query(value= "delete from public.geofence_details where id=?1", nativeQuery = true)
	int deleteByGivenID(String id);

}
