package exam.exam.service.impl;

import exam.exam.model.entity.Album;
import exam.exam.model.service.AlbumServiceModel;
import exam.exam.model.view.AlbumViewModel;
import exam.exam.repository.AlbumRepository;
import exam.exam.service.AlbumService;
import exam.exam.service.ArtistService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlbumServiceImpl implements AlbumService {
    private final ModelMapper modelMapper;
    private final ArtistService artistService;
    private final AlbumRepository albumRepository;

    public AlbumServiceImpl(ModelMapper modelMapper, ArtistService artistService, AlbumRepository albumRepository) {
        this.modelMapper = modelMapper;
        this.artistService = artistService;
        this.albumRepository = albumRepository;
    }


    @Override
    public void add(AlbumServiceModel albumServiceModel) {

         Album album=this.modelMapper.map(albumServiceModel,Album.class);
         album.setArtist(this.artistService.findByArtistName(albumServiceModel.getArtist()));
         this.albumRepository.saveAndFlush(album);
    }

    @Override
    public List<AlbumViewModel> all() {
        return this.albumRepository.findAll()
                .stream()
                .map(a -> {
                    AlbumViewModel album = this.modelMapper.map(a, AlbumViewModel.class);
                    album.setArtist(a.getArtist().getName());
                    return album;
                }).collect(Collectors.toList());
    }
}
