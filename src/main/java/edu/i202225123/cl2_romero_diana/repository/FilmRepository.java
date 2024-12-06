package edu.i202225123.cl2_romero_diana.repository;

import edu.i202225123.cl2_romero_diana.model.Film;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends CrudRepository<Film, Integer> {

    @Cacheable(value="film")
    Iterable<Film> findAll();

    @CacheEvict(value = "film", allEntries = true)
    void delete(Film film);

    @CacheEvict(value = "film", allEntries = true)
    Film save( Film film);

}
