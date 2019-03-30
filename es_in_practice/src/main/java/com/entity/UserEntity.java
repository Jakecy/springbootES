package com.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Author chihaojie
 * @Description 实体类
 * @date 2019/3/30   18:24
 **/
@Document(indexName = "mymayikt", type = "user")
@Data
public class UserEntity {


    @Id
    private String id;
    private String name;
    private int sex;
    private int age;
}
