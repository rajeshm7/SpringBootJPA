package com.rajesh.dao;

import org.springframework.data.repository.CrudRepository;

import com.rajesh.model.Footballer;

public interface FootballerRepo extends CrudRepository<Footballer, Integer>{

}
