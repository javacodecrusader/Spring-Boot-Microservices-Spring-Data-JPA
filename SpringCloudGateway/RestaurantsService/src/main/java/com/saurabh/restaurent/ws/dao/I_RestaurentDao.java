package com.saurabh.restaurent.ws.dao;

import org.springframework.data.repository.CrudRepository;

import com.saurabh.restaurent.ws.entity.Restaurent;

public interface I_RestaurentDao extends CrudRepository<Restaurent, Integer> {

}
