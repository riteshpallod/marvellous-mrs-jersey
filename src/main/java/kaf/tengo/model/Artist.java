package kaf.tengo.model;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Artist {
	String name;
	int artistId;
	
	public Artist()
	{
		
	}
	
	public Artist(String name, int artistId) 
	{
		this.name = name;
		this.artistId = artistId;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getArtistId() 
	{
		return artistId;
	}
	public void setArtistId(int artistId) 
	{
		this.artistId = artistId;
	}
}
