package br.com.mktech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mktech.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {

	Cambio findByFromAndTo(String from, String to);
	
}