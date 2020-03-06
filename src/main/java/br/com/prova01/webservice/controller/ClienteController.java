package br.com.prova01.webservice.controller;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prova01.webservice.dto.Request;
import br.com.prova01.webservice.serviceimpl.ClienteServiceImpl;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl service;

    @Transactional
    @GetMapping("/buscarpornome={nome}")
    public Response buscarByNome(@PathVariable(value = "nome") String nome){
        nome = nome.replace("&", " ");
        return Response.ok(service.buscarByNome(nome)).build();
    }

    @Transactional
    @PostMapping("/inserir")
    public Response inserir(@RequestBody Request request){
        return Response.ok(service.inserir(request.getCliente())).build();
    }

    @Transactional
    @PutMapping("/atualizar")
    public Response atualizar(@RequestBody Request request){
        return Response.ok(service.atualizar(request.getCliente())).build();
    }

    @Transactional
    @DeleteMapping("/remover={id}")
    public Response deletar(@PathVariable(value = "id") Long id){
        boolean removido = service.remover(id);
        if(removido){
            return Response.ok("Cliente removido com sucesso!").build();
        }else{
            return Response.ok("Cliente não removido!").build();
        }    
    }

    @Transactional
    @GetMapping("/buscarporid={id}")
    public Response buscarById(@PathVariable(value = "id") Long id){
        return Response.ok(service.buscarByID(id)).build();
    }
}