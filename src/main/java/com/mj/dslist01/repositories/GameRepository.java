package com.mj.dslist01.repositories;

import com.mj.dslist01.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface GameRepository extends JpaRepository<Game, Long> {
}
