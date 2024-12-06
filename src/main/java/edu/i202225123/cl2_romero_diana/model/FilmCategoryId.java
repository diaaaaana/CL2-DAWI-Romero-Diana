package edu.i202225123.cl2_romero_diana.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Embeddable
@NoArgsConstructor
public class FilmCategoryId implements Serializable {
    private Integer categoryId;
    private Integer filmId;

    public FilmCategoryId(Integer categoryId, Integer filmId) {
        this.categoryId = categoryId;
        this.filmId = filmId;
    }

}
