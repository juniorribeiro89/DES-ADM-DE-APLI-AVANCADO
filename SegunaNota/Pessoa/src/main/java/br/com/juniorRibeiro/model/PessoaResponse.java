package br.com.juniorRibeiro.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PessoaResponse {
    private Long id;
    private String nome;
    private String email;
    private String telefone;


}
