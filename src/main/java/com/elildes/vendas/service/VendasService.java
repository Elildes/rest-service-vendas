package com.elildes.vendas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elildes.vendas.entity.Item;
import com.elildes.vendas.repository.VendasRepository;

@Service
public class VendasService {
	
	@Autowired
    private VendasRepository vendasRepository;

	
    public Item salvar(Item item){
        return vendasRepository.save(item);
    }
    
    public List<Item> listaItens(){
        return vendasRepository.findAll();
    }    
    
    public Optional<Item> listaItemId (Long idItem) {
    	return vendasRepository.findById(idItem);
    }
    
    public void apagarItens() {
    	vendasRepository.deleteAll();
	}
    
	public void apagarItensPorId(Long id) {
		vendasRepository.deleteById(id);	
	}
}
