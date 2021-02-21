package exam.exam.model.service;

import exam.exam.model.entity.ArtistsName;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumServiceModel extends BaseServiceModel {
    private String name;
    private String imageUrl;
    private String description;
    private int copies;
    private BigDecimal price;
    private LocalDate releasedDate;
    private String producer;
    private String genre;
    private ArtistsName artist;

    public AlbumServiceModel() {
    }

    public String getName() {
        return name;
    }

    public AlbumServiceModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public AlbumServiceModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AlbumServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getCopies() {
        return copies;
    }

    public AlbumServiceModel setCopies(int copies) {
        this.copies = copies;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public AlbumServiceModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public LocalDate getReleasedDate() {
        return releasedDate;
    }

    public AlbumServiceModel setReleasedDate(LocalDate releasedDate) {
        this.releasedDate = releasedDate;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public AlbumServiceModel setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public AlbumServiceModel setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public ArtistsName getArtist() {
        return artist;
    }

    public AlbumServiceModel setArtist(ArtistsName artist) {
        this.artist = artist;
        return this;
    }
}
