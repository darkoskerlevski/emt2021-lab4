package mk.ukim.finki.emt.productcatalog.domain.models;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="genre")
@Getter
public class Genre {

    @Id
    @GeneratedValue
    private Long genreId;

    private String genreName;

}
