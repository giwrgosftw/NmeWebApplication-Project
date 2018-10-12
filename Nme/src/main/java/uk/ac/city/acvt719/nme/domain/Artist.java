package uk.ac.city.acvt719.nme.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Artist {
    @Id
    private int artistId;
    private String artistName;
    private String genre;
    private int sales;
    
    @OneToMany(mappedBy="artist")
    private Set<Album> albums;
    
    @OneToMany(mappedBy="artist")
    private Set<Track> tracks;

    public Artist() {
        albums = new HashSet<>();
        tracks = new HashSet<>();
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }
    
    
    @Override
    public String toString() {
        return "Artist{" + "artistId=" + artistId + ", artistName=" + artistName + ", genre=" + genre + ", sales=" + sales + '}';
    }
    
    
    
}