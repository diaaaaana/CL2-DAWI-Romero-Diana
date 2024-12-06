package edu.i202225123.cl2_romero_diana.repository;

import edu.i202225123.cl2_romero_diana.model.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends CrudRepository<Language,Integer> {
}
