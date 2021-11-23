package br.com.api.academic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.academic.model.Aluno;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long>{
}
