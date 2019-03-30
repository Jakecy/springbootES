package com.dao;

import com.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserReposiory extends CrudRepository<UserEntity, String> {


    Optional<UserEntity> findById(String id);
}
