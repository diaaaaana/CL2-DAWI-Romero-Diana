package edu.i202225123.cl2_romero_diana.service;

import edu.i202225123.cl2_romero_diana.dto.FilmDetailDto;
import edu.i202225123.cl2_romero_diana.dto.FilmDto;

import java.util.List;

public interface FilmService {

    List<FilmDto> findAll();
    FilmDetailDto findById(Integer id);
    Boolean update(FilmDetailDto filmDetailDto);
    Boolean delete(Integer id);
    Boolean save(FilmDetailDto filmDetailDto);

}
