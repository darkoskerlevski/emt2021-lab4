package mk.ukim.finki.emt.productcatalog.xport.rest;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.productcatalog.domain.models.Game;
import mk.ukim.finki.emt.productcatalog.domain.models.Product;
import mk.ukim.finki.emt.productcatalog.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductResource {

    private final GameService gameService;

    @GetMapping
    public List<Game> getAll() {
        return gameService.getAll();
    }

}
