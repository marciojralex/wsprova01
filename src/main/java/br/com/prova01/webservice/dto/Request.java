package br.com.prova01.webservice.dto;

import br.com.prova01.webservice.model.Cidade;
import br.com.prova01.webservice.model.Cliente;

public class Request {

    private Cidade cidade;

    private Cliente cliente;

    public Cidade getCidade() {
        return cidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}