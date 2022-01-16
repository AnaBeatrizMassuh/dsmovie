package com.devsuperior.dsmovie01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie01.entities.Score;
import com.devsuperior.dsmovie01.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
