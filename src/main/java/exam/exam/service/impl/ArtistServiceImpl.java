package exam.exam.service.impl;

import exam.exam.model.entity.Artist;
import exam.exam.model.entity.ArtistsName;
import exam.exam.repository.ArtistRepository;
import exam.exam.service.ArtistService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ArtistServiceImpl implements ArtistService {
    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public void initArtists() {
        if(artistRepository.count()==0){
            Arrays.stream(ArtistsName.values())
                    .forEach((artistsName -> {
                        this.artistRepository
                                .save(new Artist(artistsName,
                                       "Description "));
                    }));
        }

    }

    @Override
    public Artist findByArtistName(ArtistsName artistsName) {
        return artistRepository.findByName(artistsName).orElse(null);
    }
}
