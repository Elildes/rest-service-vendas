// Aplicação MVC no Spring

package com.elildes.vendas.model;

//import javax.persistence.Entity;
//import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

	private int num;
	private String nome;
	
//	public int getNum() {
//		return num;
//	}
//	public void setNum(int num) {
//		this.num = num;
//	}
//	
//	public String getNome() {
//		return nome;
//	}
//	
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	
//	public Item(int num, String nome) {
//		super();
//		this.num = num;
//		this.nome = nome;
//	}	
}
