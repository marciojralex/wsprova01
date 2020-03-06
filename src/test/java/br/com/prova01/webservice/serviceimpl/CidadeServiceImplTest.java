package br.com.prova01.webservice.serviceimpl;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.equalTo;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.prova01.webservice.model.Cidade;
import br.com.prova01.webservice.repository.CidadeRepository;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.rules.ErrorCollector;


@RunWith(MockitoJUnitRunner.class)
public class CidadeServiceImplTest{

    @Rule
    public ErrorCollector error = new ErrorCollector();

    @Mock
    private CidadeRepository repo;

    @InjectMocks
    private CidadeServiceImpl service;

    private Cidade cidade;

    @Before
    public void setup(){
        cidade = new Cidade();
        cidade.setId(1L);
        cidade.setNome("Florianópolis");
        cidade.setEstado("Santa Catarina");
    }

    @Test
    public void buscarByNomeDeveRetornarCidade(){
        String nomeParametro = "Florianópolis";
        
        when(repo.buscarByNome(anyString())).thenReturn(cidade);

        Cidade retorno = service.buscarByNome(nomeParametro);

        error.checkThat(retorno, notNullValue());
        error.checkThat(retorno.getNome(), equalTo(nomeParametro));

        verify(repo, times(1)).buscarByNome(nomeParametro);
    }

}