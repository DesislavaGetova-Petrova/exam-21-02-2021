package exam.exam.service;

import exam.exam.model.service.AlbumServiceModel;
import exam.exam.model.view.AlbumViewModel;

import java.util.List;

public interface AlbumService {
    void add(AlbumServiceModel albumServiceModel);

    List<AlbumViewModel> all();
}
