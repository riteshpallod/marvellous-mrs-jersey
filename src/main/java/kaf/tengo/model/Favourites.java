package kaf.tengo.model;

import java.util.ArrayList;
import java.util.List;

public class Favourites {
	List<Artist> artists = new ArrayList<Artist>();

	public Favourites()
	{
		
	}
	
	public Favourites(List<Artist> artists) 
	{
		this.artists = artists;
	}
	
	public List<Artist> getArtists() 
	{
		return artists;
	}

	public void setArtists(List<Artist> artists) 
	{
		this.artists = artists;
	}
	
	public void addtoArtists(Artist artist)
	{
		this.artists.add(artist);
	}

}
