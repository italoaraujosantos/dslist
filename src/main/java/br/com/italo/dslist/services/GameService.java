package br.com.italo.dslist.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.italo.dslist.dto.GameDTO;
import br.com.italo.dslist.dto.GameMinDTO;
import br.com.italo.dslist.entities.Game;
import br.com.italo.dslist.projections.GameMinProjection;
import br.com.italo.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public Optional<GameDTO> findById(Long id) {
		Optional<Game> result = gameRepository.findById(id);
		return result.stream().map(GameDTO::new).findAny();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO>findAll(){
		List<Game> list = gameRepository.findAll(); 
		return list.stream().map(GameMinDTO::new).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByGameList(Long listId) {
		List<GameMinProjection> games = gameRepository.searchByList(listId);
		return games.stream().map(GameMinDTO::new).toList();
	}
	
}
