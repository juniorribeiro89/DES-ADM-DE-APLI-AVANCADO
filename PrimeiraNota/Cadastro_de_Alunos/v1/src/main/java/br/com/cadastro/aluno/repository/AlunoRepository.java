package br.com.cadastro.aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cadastro.aluno.model.Alunos;

// This repository extends JPA, for translate all method.
@Repository
public interface AlunoRepository extends JpaRepository<Alunos, Long> {
	
	//this method using in AlunoServive for business rule
    public Alunos findByNome(String nome);

    public Alunos findByCurso(String curso);
}
