package com.controller;

import com.dao.UserReposiory;
import com.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Author chihaojie
 * @Description es搜索控制层
 * @date 2019/3/30   16:28
 **/

@RestController
public class EsController {

    @Autowired
    private UserReposiory userReposiory;

    @RequestMapping("/addUser")
    public UserEntity addUser(@RequestBody UserEntity user) {
        return userReposiory.save(user);
    }

    @RequestMapping("/findUser")
    public Optional<UserEntity> findUser(String id) {
        return userReposiory.findById(id);
    }


}
