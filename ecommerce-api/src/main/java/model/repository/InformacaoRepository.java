package model.repository;

import model.domain.Informacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformacaoRepository extends CrudRepository<Informacao, Integer> { }