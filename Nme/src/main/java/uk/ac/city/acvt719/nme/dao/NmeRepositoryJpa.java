package uk.ac.city.acvt719.nme.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import uk.ac.city.acvt719.nme.domain.Album;
import uk.ac.city.acvt719.nme.domain.Artist;
import uk.ac.city.acvt719.nme.domain.Track;

@Stateless
public class NmeRepositoryJpa implements NmeRepository{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Track> findAllTracks() {
        TypedQuery<Track> query = em.createQuery("SELECT t FROM Track t", Track.class);
        return query.getResultList();
    }

    @Override
    public List<Album> findAllAlbums() {
        TypedQuery<Album> query = em.createQuery("SELECT a FROM Album a", Album.class);
        return query.getResultList();
    }

    @Override
    public List<Artist> findAllArtists() {
        TypedQuery<Artist> query = em.createQuery("SELECT a FROM Artist a", Artist.class);
        return query.getResultList();
    }

    @Override
    public List<Track> findTracksOnAlbum(int albumId) {
        TypedQuery<Track> query = em.createQuery("SELECT t FROM Track t JOIN t.album a WHERE a.albumId=:albumId", Track.class);
        query.setParameter("albumId", albumId);
        return query.getResultList();
    }

    @Override
    public int artistCount() {
        Query query = em.createQuery("SELECT COUNT(a) FROM Artist a");
        Long result = (Long) query.getSingleResult();
        return result.intValue();
        }

    @Override
    public void addArtist(int artistId, String artistName, String genre, int sales) {
        Artist artist = new Artist();
        artist.setArtistId(artistId);
        artist.setArtistName(artistName);
        artist.setGenre(genre);
        artist.setSales(sales);
        em.persist(artist);
    }

    @Override
    public void removeAlbum(int albumId) {
        Album album = em.find(Album.class, albumId);
        em.remove(album);
    }

    
}