package com.prisc.diodesingpatterns.service.impl;

import java.util.Optional;

import com.prisc.diodesingpatterns.model.*;
import com.prisc.diodesingpatterns.service.ClienteService;
import com.prisc.diodesingpatterns.service.RegiaoDddService;
import com.prisc.diodesingpatterns.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementação da Strategy {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um Singleton.
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;
    @Autowired
    private RegiaoDddService regiaoDddService;

    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodos() {
        //Buscar todos os Clientes.
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        //Buscar Cliente por Id
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        //Buscar Cliente por ID, se existir:
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        // Deletar Cliente por ID.
        clienteRepository.deleteById(id);
    }


    private void salvarClienteComCep(Cliente cliente) {
        // Verificar se o Endereco do Cliente já existe (pelo CEP).
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            // Caso não exista, integrar com o ViaCEP e persistir o retorno.
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        // Inserir Cliente, vinculando o Endereco (novo ou existente).
        clienteRepository.save(cliente);
    }


    public RegiaoDdd consultarRegiao(Long id){
        Cliente cliente = clienteRepository.findById(id).get();
        Integer ddd = Integer.valueOf(cliente.getEndereco().getDdd());
        return regiaoDddService.consultarMunicipios(ddd);
    }
}