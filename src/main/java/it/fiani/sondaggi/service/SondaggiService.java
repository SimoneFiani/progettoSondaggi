package it.fiani.sondaggi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.fiani.sondaggi.entity.Sondaggio;
import it.fiani.sondaggi.repository.SondaggiRepository;

@Service
public class SondaggiService {

	@Autowired
	SondaggiRepository sondaggiRepository;

	public List<Sondaggio> getListaSondaggi() {
		return (List<Sondaggio>) sondaggiRepository.findAll();
	}

	public void salvaSondaggio(Sondaggio sondaggio) {
		sondaggiRepository.save(sondaggio);

	}

}
