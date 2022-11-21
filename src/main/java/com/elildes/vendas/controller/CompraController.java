// Aplicação MVC no Spring com parâmetro

package com.elildes.vendas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elildes.vendas.model.Item;
import com.elildes.vendas.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService service;
	
	@GetMapping("{id}")
	public ResponseEntity<Optional<Item>> obterItem(@PathVariable Integer id){
		return ResponseEntity.ok(service.getItemById(id));	
	}
	
	@PostMapping
	public ResponseEntity<String> adicionarItem(@RequestBody Item item){
		return ResponseEntity.ok(service.adicionarItem(item));		
	}
	
//	@PutMapping
//	public ResponseEntity<String> atualizarItem(){
//		return ResponseEntity.ok("Item atualizado");		
//	}

//	@DeleteMapping
//	public ResponseEntity<String> removerItem(){
//		return ResponseEntity.ok(service.removerItem(0));		
//	}
}
