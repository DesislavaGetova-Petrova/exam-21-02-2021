package exam.exam.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="albums")
public class Album extends BaseEntity{
    private String name;
    private String imageUrl;
    private String description;
    private int copies;
    private BigDecimal price;
    private LocalDate releasedDate;
    private String producer;
    private String genre;
    private Artist artist;
    private User addedFrom;

    public Album() {
    }
    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public Album setName(String name) {
        this.name = name;
        return this;
    }
    @Column(name="image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    public Album setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    @Column(columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public Album setDescription(String description) {
        this.description = description;
        return this;
    }
    @Column
    public int getCopies() {
        return copies;
    }

    public Album setCopies(int copies) {
        this.copies = copies;
        return this;
    }
    @Column
    public BigDecimal getPrice() {
        return price;
    }

    public Album setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
    @Column(name="release_date")
    public LocalDate getReleasedDate() {
        return releasedDate;
    }

    public Album setReleasedDate(LocalDate releasedDate) {
        this.releasedDate = releasedDate;
        return this;
    }
    @Column
    public String getProducer() {
        return producer;
    }

    public Album setProducer(String producer) {
        this.producer = producer;
        return this;
    }
    @Column
    public String getGenre() {
        return genre;
    }

    public Album setGenre(String genre) {
        this.genre = genre;
        return this;
    }
    @ManyToOne
    public Artist getArtist() {
        return artist;
    }

    public Album setArtist(Artist artist) {
        this.artist = artist;
        return this;
    }
    @ManyToOne
    public User getAddedFrom() {
        return addedFrom;
    }

    public Album setAddedFrom(User addedFrom) {
        this.addedFrom = addedFrom;
        return this;
    }
}
