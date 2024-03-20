package br.com.mktech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mktech.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{}