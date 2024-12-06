package edu.i202225123.cl2_romero_diana.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmActor {

    @Id
    private Integer actorId;
    @Id
    @ManyToOne
    @JoinColumn(name = "film_Id")
    private Film film;
    private Date lastUpdate;

}
