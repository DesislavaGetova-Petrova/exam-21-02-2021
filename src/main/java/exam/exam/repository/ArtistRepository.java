package exam.exam.repository;

import exam.exam.model.entity.Artist;
import exam.exam.model.entity.ArtistsName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<Artist,String> {

    Optional<Artist> findByName (ArtistsName artistsName);
}
