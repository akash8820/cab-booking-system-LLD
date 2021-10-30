package com.akash.cabbookingsystem.entity;

import lombok.Data;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
public class Cab {
	
	String cab_id;
	String driverName;
	@Setter Trip currentTrip;
	@Setter  Location currentLocation;
	@Setter boolean isAvailable;
	
	public Cab(String cab_id, String driverName) {
	    this.cab_id = cab_id;
	    this.driverName = driverName;
	    this.isAvailable = true;
	  }

}
