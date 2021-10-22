package mk.ukim.finki.emt.productcatalog.services;

import mk.ukim.finki.emt.productcatalog.domain.models.Game;
import mk.ukim.finki.emt.productcatalog.domain.models.Product;
import mk.ukim.finki.emt.productcatalog.domain.models.ProductId;
import mk.ukim.finki.emt.productcatalog.services.form.GameForm;

import java.util.List;

public interface GameService {

    Game findById(Long id);
    Game createProduct(GameForm form);
    Game orderItemCreated(Long productId);
    List<Game> getAll();

}
