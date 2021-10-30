package com.akash.cabbookingsystem.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import com.akash.cabbookingsystem.entity.Cab;
import com.akash.cabbookingsystem.entity.Location;
import com.akash.cabbookingsystem.service.ICabService;

public class CabServiceImpl implements ICabService {
	
	 Map<String, Cab> cabs = new HashMap<>();

	@Override
	public void createCab(Cab newCab) {
		
	}

	@Override
	public void updateCabLocation(String cabId, Location location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCabAvailability(String cabId, Boolean newAvailability) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getCab(String cabId) {
		// TODO Auto-generated method stub
		return null;
	}

}
