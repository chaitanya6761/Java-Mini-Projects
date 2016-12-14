// class to create the nodes for a graph

package roadgraph;

import java.util.LinkedList;
import java.util.List;

import geography.GeographicPoint;

public class MapNode implements Comparable<MapNode>{
	
	// Member Variables
	private GeographicPoint location; // To represent the location of a node on map
	private List<MapEdge> edges;  // List of edges from this node
	private double distance;
	private double slineDistance;
	
	// constructor to initialize the member variables
	public MapNode(GeographicPoint location, List<MapEdge> edges) {
		super();
		this.location = location;
		this.edges = edges;
		this.distance = 0;
		this.slineDistance = 0;
	}

	// Getters and setters to access the private member variables
	public GeographicPoint getLocation() {
		return location;
	}

	public void setLocation(GeographicPoint location) {
		this.location = location;
	}

	public List<MapEdge> getEdges() {
		return edges;
	}

	public void setEdges(List<MapEdge> edges) {
		this.edges = edges;
	}
	

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public List<GeographicPoint> getNeighbors()
	{
		LinkedList<GeographicPoint> neighbors = new LinkedList<GeographicPoint>(); 
		for(MapEdge edge : getEdges())
		{
			neighbors.add(edge.getEnd());
		}
		return neighbors;
	}
	
	public double getSlineDistance() {
		return slineDistance;
	}

	public void setSlineDistance(double slineDistance) {
		this.slineDistance = slineDistance;
	}

	@Override
	public int compareTo(MapNode obj) 
	{
		if( this.getDistance() + this.getSlineDistance() == obj.getDistance()   + obj.getSlineDistance())
			return 0;
		else if( this.getDistance() + this.getSlineDistance() > obj.getDistance()  + obj.getSlineDistance())
			return 1;
		else 
			return -1;
	}

}
