package exam.exam.service;

import exam.exam.model.entity.Artist;
import exam.exam.model.entity.ArtistsName;

public interface ArtistService {
    void initArtists();

    Artist findByArtistName(ArtistsName artistsName);
}
