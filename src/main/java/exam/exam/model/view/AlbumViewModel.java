package exam.exam.model.view;

import exam.exam.model.entity.Artist;
import exam.exam.model.entity.ArtistsName;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumViewModel {
    private String name;
    private String imageUrl;
    private int copies;
    private BigDecimal price;
    private LocalDate releasedDate;
    private String genre;
    private ArtistsName artist;

    public AlbumViewModel() {
    }

    public String getName() {
        return name;
    }

    public AlbumViewModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public AlbumViewModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public int getCopies() {
        return copies;
    }

    public AlbumViewModel setCopies(int copies) {
        this.copies = copies;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public AlbumViewModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public LocalDate getReleasedDate() {
        return releasedDate;
    }

    public AlbumViewModel setReleasedDate(LocalDate releasedDate) {
        this.releasedDate = releasedDate;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public AlbumViewModel setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public ArtistsName getArtist() {
        return artist;
    }

    public AlbumViewModel setArtist(ArtistsName artist) {
        this.artist = artist;
        return this;
    }
}
