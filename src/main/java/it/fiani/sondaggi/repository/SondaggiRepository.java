package it.fiani.sondaggi.repository;

import org.springframework.data.repository.CrudRepository;

import it.fiani.sondaggi.entity.Sondaggio;

public interface SondaggiRepository extends CrudRepository<Sondaggio, Long> {

}
