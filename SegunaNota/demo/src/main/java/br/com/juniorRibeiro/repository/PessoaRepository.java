package br.com.juniorRibeiro.repository;

import br.com.juniorRibeiro.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    Pessoa findByNome(String nome);

    Pessoa findByCurso(String curso);
}
