package it.fiani.sondaggi.service;

import org.springframework.beans.factory.annotation.Autowired;

import it.fiani.sondaggi.repository.SondaggiRepository;

public class SondaggiService {
	@Autowired
	SondaggiRepository sondaggiRepository;

}
