package br.com.cadastro.aluno.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import br.com.cadastro.aluno.model.Alunos;
import br.com.cadastro.aluno.service.AlunoService;

import java.util.List;

// metodos implementados para que seja possivel receber do cliente as requisições.
//Atraves da classe service.

@AllArgsConstructor
@RestController
@RequestMapping("/cadastro")
public class AlunoController {

    
    private  AlunoService service;

    /* This method return all object in list */ 
    @GetMapping
    public List<Alunos> alunos() {
        return this.service.alunos();
    }

    /* This method - post, save attributes with request @requestBoady */
    @PostMapping
    public String post(@RequestBody Alunos aluno) {
        this.service.save(aluno);
        return "Aluno Salvo com sucesso!";
    }

    /*This method - Save /Alter, the representation this entity Aluno is save/alter with method put in archive Json.*/
    @PutMapping
    public String put(@Validated Alunos aluno) {
        this.service.save(aluno);
        return "Salvo com sucesso";
    }

    /*this method dell of data of ID, @PathVariable setando o attributes*/
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        this.service.remove(id);
        return "Aluno removido com sucesso";
    }

    /* Remove this id.*/   
    @DeleteMapping
    public String deleteII(@RequestParam("id") Long id){
        this.service.remove(id);
        return "Removido com sucesso";
    }
    /* This method receive the name*/
    @GetMapping("/nome")
    public Alunos getByNome(@RequestParam("nome") String nome){
        return this.service.getByNome(nome);
    }
    
    /* this method application of get this name of curse */
    @GetMapping("/curso")
    public Alunos getByCurso(@RequestParam("curso") String curso){
        return this.service.getByCurso(curso);
    }
}
