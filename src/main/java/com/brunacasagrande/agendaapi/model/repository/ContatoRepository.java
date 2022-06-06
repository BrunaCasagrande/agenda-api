package com.brunacasagrande.agendaapi.model.repository;

import com.brunacasagrande.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
