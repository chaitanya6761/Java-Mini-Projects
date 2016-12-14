// class to create the nodes for a graph

package roadgraph;

import java.util.List;

import geography.GeographicPoint;

public class MapNode {
	
	// Member Variables
	private GeographicPoint location; // To represent the location of a node on map
	private List<MapEdge> edges;	  // List of edges from this node
	
	// constructor to initialize the member variables
	public MapNode(GeographicPoint location, List<MapEdge> edges) {
		super();
		this.location = location;
		this.edges = edges;
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
	
	
	
	
	

}
