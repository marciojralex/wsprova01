package br.com.prova01.webservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.prova01.webservice.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
    @Query(value = "SELECT * FROM CLIENTE WHERE NOME = :nome ORDER BY NOME ASC", nativeQuery = true)
    public List<Cliente> buscarByNome(String nome);

    @Query(value = "SELECT * FROM CLIENTE WHERE ID = :id ORDER BY NOME ASC", nativeQuery = true)
    public Cliente buscarById(Long id);
}