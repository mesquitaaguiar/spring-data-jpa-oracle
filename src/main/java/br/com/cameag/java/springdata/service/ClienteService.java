package br.com.cameag.java.springdata.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cameag.java.springdata.entity.Cliente;
import br.com.cameag.java.springdata.repository.ClienteRepository;

@Service
@Transactional(readOnly = false)
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> findAllCliente(){

        return clienteRepository.findAll();
    }

    public void deleteById(Long id){
    	clienteRepository.deleteById(id);
    }

    public Cliente findByClienteId(Long clienteid){
        return clienteRepository.findByClienteId(clienteid);
    }
    
	public String functionGetNome(Integer id){ 
		return clienteRepository.callFunctionGetTabela3(id); 
	}
	
    
	/*
	 * public String functionGetNome(Integer id, String nome){ return
	 * clienteRepository.functionGetNome(id,nome); }
	 */
}
