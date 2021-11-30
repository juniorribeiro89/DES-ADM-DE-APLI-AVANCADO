package br.com.juniorRibeiro.service;


import br.com.juniorRibeiro.model.Pessoa;
import br.com.juniorRibeiro.model.PessoaRequest;
import br.com.juniorRibeiro.model.PessoaResponse;
import br.com.juniorRibeiro.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService {
    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public Pessoa salvarPessoa(PessoaRequest dto) {
        return this.repository.save(convertePessoaRequestParaPessoa(dto));
    }

   /*
   * Retornando uma lista com todos os objetos
   */
    public List<PessoaResponse> lista(){
        return this.repository.findAll()
                .stream()
                .map(p-> convertePessoaResponse(p))
                .collect(Collectors.toList());
    }

    /*
     * Padrão DTO sendo usado para converter pessoaRequet em pessoa
     */
    private Pessoa convertePessoaRequestParaPessoa(PessoaRequest dto) {
        return Pessoa.builder()
                .nome(dto.getNome())
                .email(dto.getEmail())
                .telefone(dto.getTelefone())
                .build();
    }

    //Usando o padrão DTO para converter a entidade
    private PessoaResponse convertePessoaResponse(Pessoa pessoa) {
        return PessoaResponse.builder()
                .id(pessoa.getId())
                .nome(pessoa.getNome())
                .email(pessoa.getEmail())
                .telefone(pessoa.getTelefone())
                .build();
    }

    /*
     * Metodo usado para deletar pelo id.
     */
    public void deletePessoa(Long id) {
        this.repository.deleteById(id);
    }


}
