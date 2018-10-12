package uk.ac.city.acvt719.nme.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Track {
    @Id
    private int trackId;
    private String trackName;
    private float duration;
    private Date recordingDate;
    
    @ManyToOne
    @JoinColumn(name="artistId")
    private Artist artist;
    
    @ManyToOne
    @JoinColumn(name="albumId")
    private Album album;

    public Track() {
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public Date getRecordingDate() {
        return recordingDate;
    }

    public void setRecordingDate(Date recordingDate) {
        this.recordingDate = recordingDate;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Track{" + "trackId=" + trackId + ", trackName=" + trackName + ", duration=" + duration + ", recordingDate=" + recordingDate + ", artist=" + artist + ", album=" + album.getAlbumTitle() + '}';
    }

    
}