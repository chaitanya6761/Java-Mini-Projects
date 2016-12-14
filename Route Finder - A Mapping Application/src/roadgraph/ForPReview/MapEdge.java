// A class to hold the edges
package roadgraph;

import geography.GeographicPoint;



public class MapEdge {	
	
	// Member variables
	private GeographicPoint start;  // To represent start of a edge 
	private GeographicPoint end;    // To represent end of a edge 
	private String roadName;		// To hold the value of road name
	private String roadType;		// To hold the value of road type
	private double length;			// To hold the value of road length between start and end points
	
	
	// constructor to initialize the member variables 
	public MapEdge(GeographicPoint start, GeographicPoint end, String roadName, String roadType, double length) {
		super();
		this.start = start;
		this.end = end;
		this.roadName = roadName;
		this.roadType = roadType;
		this.length = length;
	}

	// Getters and setters to  access the private member variables
	
	public GeographicPoint getStart() {
		return start;
	}

	public void setStart(GeographicPoint start) {
		this.start = start;
	}

	public GeographicPoint getEnd() {
		return end;
	}

	public void setEnd(GeographicPoint end) {
		this.end = end;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public String getRoadType() {
		return roadType;
	}

	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}		

}
