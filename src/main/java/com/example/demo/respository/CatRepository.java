package com.example.demo.respository;

import com.example.demo.bean.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat, Integer> {

}
