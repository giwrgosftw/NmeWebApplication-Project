package uk.ac.city.acvt719.nme.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;
import uk.ac.city.acvt719.nme.domain.Artist;
import uk.ac.city.acvt719.nme.domain.Track;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-16T12:34:47")
@StaticMetamodel(Album.class)
public class Album_ { 

    public static volatile SingularAttribute<Album, DateTime> releaseDate;
    public static volatile SingularAttribute<Album, Artist> artist;
    public static volatile SingularAttribute<Album, Integer> albumId;
    public static volatile SingularAttribute<Album, String> albumTitle;
    public static volatile SetAttribute<Album, Track> tracks;

}