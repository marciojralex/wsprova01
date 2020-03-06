package br.com.prova01.webservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prova01.webservice.model.Cliente;
import br.com.prova01.webservice.repository.ClienteRepository;
import br.com.prova01.webservice.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repo;

    @Override
    public Cliente inserir(Cliente cliente) {
        return repo.save(cliente);
    }

    @Override
    public boolean remover(Long id) {
        repo.deleteById(id);
        Cliente cliente = repo.buscarById(id);
        return cliente == null ? true : false;
    }

    @Override
    public Cliente atualizar(Cliente cliente) {
        return repo.save(cliente);
    }

    @Override
    public Cliente buscarByID(Long id) {
        return repo.buscarById(id);
    }

    @Override
    public List<Cliente> buscarByNome(String nome) {
        return repo.buscarByNome(nome);
    }

}