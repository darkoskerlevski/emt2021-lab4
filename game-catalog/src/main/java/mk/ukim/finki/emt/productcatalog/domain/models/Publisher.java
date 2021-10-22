package mk.ukim.finki.emt.productcatalog.domain.models;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="product")
@Getter
public class Publisher {

    @Id
    @GeneratedValue
    private Long genreId;

    private String genreName;
}
