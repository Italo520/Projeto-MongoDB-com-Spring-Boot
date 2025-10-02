package com.italo.cursospring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.italo.cursospring.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
