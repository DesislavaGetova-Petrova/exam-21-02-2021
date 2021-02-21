package exam.exam.model.binding;

import exam.exam.model.entity.Artist;
import exam.exam.model.entity.ArtistsName;
import exam.exam.model.entity.User;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumAddBindingModel {
    private String name;
    private String imageUrl;
    private String description;
    private int copies;
    private BigDecimal price;
    private LocalDate releasedDate;
    private String producer;
    private String genre;
    private ArtistsName artist;

    public AlbumAddBindingModel() {
    }
    @NotNull
    @Size(min=3,max=20, message = "Name must be between 3 and 20 characters!")
    public String getName() {
        return name;
    }

    public AlbumAddBindingModel setName(String name) {
        this.name = name;
        return this;
    }
    @NotNull
    @Size(min=5, message = "ImageUrl must be minimum 5 characters!")
    public String getImageUrl() {
        return imageUrl;
    }

    public AlbumAddBindingModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    @Size(min=5, message = "ImageUrl must be minimum 5 characters!")
    public String getDescription() {
        return description;
    }

    public AlbumAddBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }
    @Min(value=10)
    public int getCopies() {
        return copies;
    }

    public AlbumAddBindingModel setCopies(int copies) {
        this.copies = copies;
        return this;
    }
    @DecimalMin(value = "0")
    public BigDecimal getPrice() {
        return price;
    }

    public AlbumAddBindingModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
    @DateTimeFormat( pattern = "yyyy-MM-dd")
    @PastOrPresent(message = "The date cannot be in the future")
    public LocalDate getReleasedDate() {
        return releasedDate;
    }

    public AlbumAddBindingModel setReleasedDate(LocalDate releasedDate) {
        this.releasedDate = releasedDate;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public AlbumAddBindingModel setProducer(String producer) {
        this.producer = producer;
        return this;
    }
    @NotNull(message = "You must select genre")
    public String getGenre() {
        return genre;
    }

    public AlbumAddBindingModel setGenre(String genre) {
        this.genre = genre;
        return this;
    }
    @NotNull(message = "You must select artist")
    public ArtistsName getArtist() {
        return artist;
    }

    public AlbumAddBindingModel setArtist(ArtistsName artist) {
        this.artist = artist;
        return this;
    }
}
