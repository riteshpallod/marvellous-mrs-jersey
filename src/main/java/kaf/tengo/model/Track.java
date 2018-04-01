package kaf.tengo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Track {
	int trackId;
	String name;
	public Track(int trackId, String name, int albumId) 
	{
		this.trackId = trackId;
		this.name = name;
	}
	
	public int getTrackId() {
		return trackId;
	}
	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
