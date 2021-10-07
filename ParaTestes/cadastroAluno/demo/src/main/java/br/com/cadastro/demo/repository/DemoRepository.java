package br.com.cadastro.demo.repository;

import br.com.cadastro.demo.model.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<Alunos, Long> {

    public Alunos findByNome(String nome);

    public Alunos findByCurso(String curso);
}
