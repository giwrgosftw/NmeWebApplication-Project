package uk.ac.city.acvt719.nme.dao;

import java.util.List;
import uk.ac.city.acvt719.nme.domain.Album;
import uk.ac.city.acvt719.nme.domain.Artist;
import uk.ac.city.acvt719.nme.domain.Track;

public interface NmeRepository {

    List<Artist> findAllArtists();

    List<Track> findAllTracks();

    List<Album> findAllAlbums();

    List<Track> findTracksOnAlbum(int albumId);

    int artistCount();

    void addArtist(int artistId, String artistName, String genre, int sales);

    void removeAlbum(int albumId);

}
