package br.com.prova01.webservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prova01.webservice.model.Cidade;
import br.com.prova01.webservice.repository.CidadeRepository;
import br.com.prova01.webservice.service.CidadeService;

@Service
public class CidadeServiceImpl implements CidadeService {

    @Autowired
    private CidadeRepository repo;

    @Override
    public Cidade inserir(Cidade cidade) {
        return repo.save(cidade);
    }

    @Override
    public Boolean remover(Long id) {
        repo.deleteById(id);
        Cidade cidade = repo.buscarById(id);
        return cidade == null ? true : false ;
    }

    @Override
    public Cidade atualizar(Cidade cidade) {
        return repo.save(cidade);
    }

    @Override
    public Cidade buscarByNome(String nome) {
        return repo.buscarByNome(nome);
    }

    @Override
    public List<Cidade> buscarByEstado(String estado) {
        return repo.buscarByEstado(estado);
    }

}