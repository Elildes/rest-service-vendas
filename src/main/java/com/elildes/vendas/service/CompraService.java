// Aplicação MVC no Spring com parâmetro

package com.elildes.vendas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.elildes.vendas.model.Item;

@Service
public class CompraService {
	private List<Item> compras = new ArrayList<>();
	
	public String adicionarItem(Item item) {
		compras.add(item);
		return "Item adicionado";
	}
	
	public Optional<Item> getItemById(Integer num) {
		for (Item i : compras) {
			if (i.getNum() == num) {
				return Optional.of(i);
			}
		}
		return Optional.empty();
	}
	
//	public void removerItem(int index) {
//		compras.remove(index);
//	}
}
