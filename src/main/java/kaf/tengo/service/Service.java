package kaf.tengo.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kaf.tengo.model.Artist;
import kaf.tengo.model.Favourites;
import kaf.tengo.model.Album;

public class Service {

	static Favourites favDB = new Favourites();
	
	public Service()
	{
		ConnectorLite.setupConnectorLite();
	}
	
	public List<Artist> listOfArtists() 
	{
		List<Artist> artists = new ArrayList<Artist>();
		try {
			String select = "SELECT * FROM artists";
			Statement stmt = ConnectorLite.connLite.createStatement();
			ResultSet rs = stmt.executeQuery(select);
			
			while (rs.next())
			{
				int id = rs.getInt("ArtistId");
				String name = rs.getString("Name");
				artists.add(new Artist(name,id));
			}
		}
		catch(SQLException se){
	        se.printStackTrace();
	    }
	    catch(Exception e){
	        e.printStackTrace();
	    }
		return artists;
	}

	public List<Album> albumsFromArtist(int artistId) {
		List<Album> albums = new ArrayList<Album>();
		try {
			String select = "SELECT * FROM albums WHERE ArtistId = " + Integer.toString(artistId);
			Statement stmt = ConnectorLite.connLite.createStatement();
			ResultSet rs = stmt.executeQuery(select);
			
			while (rs.next())
			{
				int albumId = rs.getInt("AlbumId");
				String title = rs.getString("Title");
				albums.add(new Album(albumId, title, artistId));
			}
		}
		catch(SQLException se){
	        se.printStackTrace();
	    }
	    catch(Exception e){
	        e.printStackTrace();
	    }
		return albums;
	}

	public void addFavouriteArtist(Artist artist) {
		favDB.addtoArtists(artist);
	}

	public List<Artist> getallFavourites() {
		return favDB.getArtists();
	}
	
	
}
