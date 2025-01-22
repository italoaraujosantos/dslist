package br.com.italo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.italo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
