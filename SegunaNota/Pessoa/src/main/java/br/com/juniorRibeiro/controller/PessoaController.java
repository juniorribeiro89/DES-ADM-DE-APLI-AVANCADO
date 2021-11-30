package br.com.juniorRibeiro.controller;

import br.com.juniorRibeiro.model.Pessoa;
import br.com.juniorRibeiro.model.PessoaRequest;
import br.com.juniorRibeiro.model.PessoaResponse;
import br.com.juniorRibeiro.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Pessoa> salvarPessoa (@RequestBody PessoaRequest pessoa) {
        return new ResponseEntity<Pessoa>(this.service.salvarPessoa(pessoa), HttpStatus.CREATED);
    }

    // in class service: method return list with objects json.
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<List<PessoaResponse>> lista(){
        return ResponseEntity.ok(this.service.lista());
    }

    // the method used for delete people, with class service.
    @DeleteMapping
    @ResponseStatus(code = HttpStatus.OK)
    public void deletePessoa(@RequestParam("id") Long id) {
        this.service.deletePessoa(id);
    }




}
