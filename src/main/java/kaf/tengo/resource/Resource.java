package kaf.tengo.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import kaf.tengo.model.Album;
import kaf.tengo.model.Artist;
import kaf.tengo.service.Service;

@XmlRootElement
@Produces(MediaType.APPLICATION_JSON)
@Path("/chinook")
public class Resource {

	Service service = new Service();
	
	@GET
	@Path("/artists")
	public List<Artist> getArtistNames()
	{
		return service.listOfArtists();
	}
	
	@GET
	@Path("/artists/albums/{artistId}")
	public List<Album> getArtistNames(@PathParam("artistId") int id)
	{
		System.out.println("id : "+Integer.toString(id));
		return service.albumsFromArtist(id);
	}
	
	@POST
	@Path("/favourites/artists")
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Artist> addProfile(Artist artist)
	{
		service.addFavouriteArtist(artist);
		return service.getallFavourites();
	}
		
	@DELETE
	@Path("/{profileId}")
	public List<Profile> removeProfile(@PathParam("profileId") int id)
	{
		 connector.removeProfile(id);
		 return connector.getallProfiles();
	}
	
	//put, post(c), delete
}
