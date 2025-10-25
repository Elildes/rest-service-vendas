package com.elildes.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elildes.vendas.entity.Item;

public interface VendasRepository extends JpaRepository<Item, Long>  {

}
