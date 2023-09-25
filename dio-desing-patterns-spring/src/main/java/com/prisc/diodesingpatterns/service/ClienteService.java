package com.prisc.diodesingpatterns.service;

import com.prisc.diodesingpatterns.model.Cliente;
import com.prisc.diodesingpatterns.model.RegiaoDdd;

/**
 * Interface que define o padrão Strategy no domínio de cliente.
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
    RegiaoDdd consultarRegiao(Long id);


}