package com.manuanand.battlechess;

import org.springframework.data.repository.CrudRepository;

import com.manuanand.battlechess.Game;

// This will be AUTO IMPLEMENTED by Spring into a Bean called nodeRepository
// CRUD refers Create, Read, Update, Delete

public interface GameRepository extends CrudRepository<Game, Integer> {

}
