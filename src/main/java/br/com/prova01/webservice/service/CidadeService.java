package br.com.prova01.webservice.service;

import java.util.List;

import br.com.prova01.webservice.model.Cidade;

public interface CidadeService {

    public Cidade inserir(Cidade cidade);

    public Boolean remover(Long id);

    public Cidade atualizar(Cidade cidade);

    public Cidade buscarByNome(String nome);

    public List<Cidade> buscarByEstado(String estado);
}