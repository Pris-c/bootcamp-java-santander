package com.prisc.diodesingpatterns.service;

import com.prisc.diodesingpatterns.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Client HTTP, criado via OpenFeign para o consumo da API do ViaCEP
 */

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    //@RequestMapping(method= RequestMethod.GET, value = "/{cep}/json/")
    //Endereco consultarCep(@PathVariable("cep") String cep);

    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}