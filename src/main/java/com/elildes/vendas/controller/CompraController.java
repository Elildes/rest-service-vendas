// Aplicação MVC no Spring

package com.elildes.vendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elildes.vendas.model.Item;
import com.elildes.vendas.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService service;
	
	@GetMapping
	public ResponseEntity<List<Item>> obterItem(){
		return ResponseEntity.ok(service.getItens());		
	}
	
	@PostMapping
	public ResponseEntity<String> adicionarItem(){
		return ResponseEntity.ok(service.adicionarItem(new Item(1, "Mouse")));		
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
