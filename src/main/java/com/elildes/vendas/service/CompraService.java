// Aplicação MVC no Spring

package com.elildes.vendas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.elildes.vendas.model.Item;

@Service
public class CompraService {
	private List<Item> compras = new ArrayList<>();
	
	public String adicionarItem(Item item) {
		compras.add(item);
		return "Item adicionado";
	}
	
	public List<Item> getItens() {
		return compras;
	}
	
//	public void removerItem(int index) {
//		compras.remove(index);
//	}
}
