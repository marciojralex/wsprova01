package br.com.prova01.webservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.prova01.webservice.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

    @Query(value = "SELECT * FROM CIDADE WHERE NOME = :nome ", nativeQuery = true)
    public Cidade buscarByNome(String nome);

    @Query(value = "SELECT * FROM CIDADE WHERE ESTADO = :estado ORDER BY NOME ASC ", nativeQuery = true)
    public List<Cidade> buscarByEstado(String estado);

    @Query(value = "SELECT * FROM CIDADE WHERE ID = :id ", nativeQuery = true)
    public Cidade buscarById(Long id);
    
}