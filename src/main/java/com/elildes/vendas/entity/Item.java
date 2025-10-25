package com.elildes.vendas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Item {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
    private int qtde;
	
	@Column
	private String nome;

}
