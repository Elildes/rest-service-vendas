package com.elildes.vendas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.elildes.vendas.entity.Item;
import com.elildes.vendas.service.VendasService;


@RestController
@RequestMapping("/vendas")
public class VendasController {
	
	@Autowired
	private VendasService vendaService;
	
    @PostMapping
    @NewSpan("salvar-vendas")
    public ResponseEntity<Item> salvar(@RequestBody Item venda){
    	return ResponseEntity.ok(vendaService.salvar(venda));
    }
    
    @NewSpan("listar-vendas")
    @GetMapping
    public ResponseEntity<List<Item>> listaVendas(){
    	return ResponseEntity.ok(vendaService.listaItens());
    }
    
    @GetMapping("/{id}")
    @NewSpan("listar-vendas-id")
    public ResponseEntity<Optional<Item>> listaVendaId(@PathVariable Long id){
    	return ResponseEntity.ok(vendaService.listaItemId(id));
    }
    
    @DeleteMapping("/{id}")
    @NewSpan("deletar-vendas-id")
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void apagarVendaPoId(@PathVariable Long id) {
		try {
			vendaService.apagarItensPorId(id);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
    @DeleteMapping
    @NewSpan("deletar-vendas")
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void apagarClientes() {
		try {
			vendaService.apagarItens();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
}
