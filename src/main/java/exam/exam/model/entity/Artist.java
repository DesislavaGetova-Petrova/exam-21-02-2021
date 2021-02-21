package exam.exam.model.entity;

import javax.persistence.*;

@Entity
@Table(name="artists")
public class Artist extends BaseEntity{
    private ArtistsName name;
    private String careerInformation;

    public Artist() {
    }

    public Artist(ArtistsName name, String careerInformation) {
        this.name = name;
        this.careerInformation = careerInformation;
    }
    @Enumerated(value = EnumType.STRING)
    public ArtistsName getName() {
        return name;
    }

    public Artist setName(ArtistsName name) {
        this.name = name;
        return this;
    }
    @Column(name="career_information", columnDefinition = "TEXT")
    public String getCareerInformation() {
        return careerInformation;
    }

    public Artist setCareerInformation(String careerInformation) {
        this.careerInformation = careerInformation;
        return this;
    }
}
