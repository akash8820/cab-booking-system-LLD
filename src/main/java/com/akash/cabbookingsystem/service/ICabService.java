package com.akash.cabbookingsystem.service;

import com.akash.cabbookingsystem.entity.Cab;
import com.akash.cabbookingsystem.entity.Location;

public interface ICabService {

	void createCab(Cab cab);

	void updateCabLocation(String cabId, Location location);

	void updateCabAvailability(String cabId, Boolean newAvailability);

	Object getCab(String cabId);

}
