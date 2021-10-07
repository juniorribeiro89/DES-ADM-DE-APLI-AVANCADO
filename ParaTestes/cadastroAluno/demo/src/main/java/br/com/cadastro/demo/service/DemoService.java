package br.com.cadastro.demo.service;

import br.com.cadastro.demo.model.Alunos;
import br.com.cadastro.demo.repository.DemoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DemoService {

    @Autowired
    private final DemoRepository repository;

    public void save(Alunos aluno) {
        this.repository.save(aluno);
    }

    public List<Alunos> alunos() {
        return this.repository.findAll();
    }

    public void remove(Long id) {
        this.repository.deleteById(id);
    }

    public Alunos getByNome(String nome){
        return  this.repository.findByNome(nome);
    }

    public Alunos getByCurso(String curso){
        return  this.repository.findByCurso(curso);
    }

}
