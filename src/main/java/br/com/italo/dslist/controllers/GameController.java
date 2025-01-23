package br.com.italo.dslist.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.italo.dslist.dto.GameDTO;
import br.com.italo.dslist.dto.GameMinDTO;
import br.com.italo.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public Optional<GameDTO>  findId(@PathVariable Long id) {
		return gameService.findById(id);
	}
	
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> list = gameService.findAll();
		return list;
	}
}
