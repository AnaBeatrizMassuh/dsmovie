package com.devsuperior.dsmovie01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie01.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
