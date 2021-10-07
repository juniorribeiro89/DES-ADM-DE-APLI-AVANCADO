package br.com.cadastro.aluno.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cadastro.aluno.model.Alunos;
import br.com.cadastro.aluno.repository.AlunoRepository;

import java.util.List;

// Class that understands business rules
@Service
@AllArgsConstructor
public class AlunoService {

    @Autowired
    private  AlunoRepository repository;
    
    //this method save.
    public void save(Alunos aluno) {
        this.repository.save(aluno);
    }
    // this method list all objects 
    public List<Alunos> alunos() {
        return this.repository.findAll();
    }
    
    //This method delete for id.
    public void remove(Long id) {
        this.repository.deleteById(id);
    }
    
    //return names with getName
    public Alunos getByNome(String nome){
        return  this.repository.findByNome(nome);
    }
    
  //return names with getCurso
    public Alunos getByCurso(String curso){
        return  this.repository.findByCurso(curso);
    }

}
