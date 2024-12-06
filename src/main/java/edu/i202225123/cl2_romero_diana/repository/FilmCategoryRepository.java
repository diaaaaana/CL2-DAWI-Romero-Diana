package edu.i202225123.cl2_romero_diana.repository;

import edu.i202225123.cl2_romero_diana.model.FilmCategory;
import edu.i202225123.cl2_romero_diana.model.FilmCategoryId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmCategoryRepository extends CrudRepository<FilmCategory, FilmCategoryId> {
}
