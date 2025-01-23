package br.com.italo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.italo.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
