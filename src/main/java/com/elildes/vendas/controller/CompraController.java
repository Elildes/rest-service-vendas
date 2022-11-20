// Serviço Rest via Controlador

package com.elildes.vendas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@GetMapping
	public ResponseEntity<String> obterItem(){
		return ResponseEntity.ok("Item obtido");		
	}
	
	@PostMapping
	public ResponseEntity<String> adicionarItem(){
		return ResponseEntity.ok("Item adicionado");		
	}
	
	@PutMapping
	public ResponseEntity<String> atualizarItem(){
		return ResponseEntity.ok("Item atualizado");		
	}

	@DeleteMapping
	public ResponseEntity<String> removerItem(){
		return ResponseEntity.ok("Item removido");		
	}
}
