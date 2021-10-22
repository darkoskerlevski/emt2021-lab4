package mk.ukim.finki.emt.productcatalog.services.impl;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.productcatalog.domain.exceptions.ProductNotFoundException;
import mk.ukim.finki.emt.productcatalog.domain.models.Game;
import mk.ukim.finki.emt.productcatalog.domain.models.Game;
import mk.ukim.finki.emt.productcatalog.domain.models.ProductId;
import mk.ukim.finki.emt.productcatalog.domain.repository.GameRepository;
import mk.ukim.finki.emt.productcatalog.services.GameService;
import mk.ukim.finki.emt.productcatalog.services.form.GameForm;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    @Override
    public Game findById(Long id) {
        return gameRepository.findById(id).orElseThrow(ProductNotFoundException::new);
    }

    @Override
    public Game createProduct(GameForm form) {
        Game p = new Game(form.getGameName(),form.getPrice());
        gameRepository.save(p);
        return p;
    }

    @Override
    public Game orderItemCreated(Long productId) {
        Game p = gameRepository.findById(productId).orElseThrow(ProductNotFoundException::new);
        gameRepository.saveAndFlush(p);
        return p;
    }

    @Override
    public List<Game> getAll() {
        return gameRepository.findAll();
    }
}
