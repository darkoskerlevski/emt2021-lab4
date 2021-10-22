package mk.ukim.finki.emt.productcatalog.domain.models;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="game")
@Getter
public class Game {

    @Id
    @GeneratedValue
    private Long gameId;

    private String gameName;

    private Money gamePrice;

    private Integer gameQuantity;


    public Game(String gameName, Money price) {
        this.gameName = gameName;
        this.gamePrice = price;
    }
}
