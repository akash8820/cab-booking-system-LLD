package com.akash.cabbookingsystem.entity;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class Location {
	
	private double x;
	private double y;

	public Location(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Double distance(Location SecondLocation) {
	    return sqrt( pow(this.x - SecondLocation.x, 2) + pow(this.y - SecondLocation.y, 2) );
	  }
	

}
