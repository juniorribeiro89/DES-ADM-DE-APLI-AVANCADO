package br.com.cadastro.demo.controller;

import br.com.cadastro.demo.model.Alunos;
import br.com.cadastro.demo.service.DemoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/cadastro")
public class Controller {

    @Autowired
    private final DemoService service;

    //Chamando pelo request (Lista de aluno cadastrado)
    @GetMapping
    public List<Alunos> alunos() {
        return this.service.alunos();
    }

    //Chamando pelo request (cadastrar o aluno)
    @PostMapping
    public String post(@RequestBody Alunos aluno) {
        this.service.save(aluno);
        return "Aluno Salvo com sucesso!";
    }

    //Chamando pelo request (alteração de aluno)
    @PutMapping
    public String put(@Validated Alunos aluno) {
        this.service.save(aluno);
        return "Salvo com sucesso";
    }

    //Remove Pelo Id passado no request (remoção de aluno)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        this.service.remove(id);
        return "Aluno removido com sucesso";
    }

    //Removendo pelo os parâmetro
    @DeleteMapping
    public String deleteII(@RequestParam("id") Long id){
        this.service.remove(id);
        return "Removido com sucesso";
    }

    @GetMapping("/nome")
    public Alunos getByNome(@RequestParam("nome") String nome){
        return this.service.getByNome(nome);
    }

    @GetMapping("/curso")
    public Alunos getByCurso(@RequestParam("curso") String curso){
        return this.service.getByCurso(curso);
    }
}
