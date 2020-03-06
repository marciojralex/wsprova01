package br.com.prova01.webservice.service;

import java.util.List;

import br.com.prova01.webservice.model.Cliente;

public interface ClienteService {

    public Cliente inserir(Cliente cliente);

    public boolean remover(Long id);

    public Cliente atualizar(Cliente cliente);

    public Cliente buscarByID(Long id);
    
    public List<Cliente> buscarByNome(String nome);
}