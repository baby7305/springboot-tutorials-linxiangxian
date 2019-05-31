package com.example.demo.service;

import com.example.demo.bean.Cat;
import com.example.demo.respository.Cat2Repository;
import com.example.demo.respository.CatRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class CatService {

	@Resource
	private CatRepository catRepository;

	@Resource
	private Cat2Repository cat2Repository;

	/**
	 * save,update ,delete 方法需要绑定事务.
	 * <p>
	 * 使用@Transactional进行事务的绑定.
	 *
	 * @param cat
	 */

	//保存数据.
	@Transactional
	public void save(Cat cat) {
		catRepository.save(cat);
	}

	//删除数据》
	@Transactional
	public void delete(int id) {
		catRepository.deleteById(id);
	}

	//查询数据.
	public Iterable<Cat> getAll() {
		return catRepository.findAll();
	}

	public Cat findByCatName(String catName) {
		return cat2Repository.findByCatName(catName);
	}


	public Cat findByCatName2(String catName) {
		return cat2Repository.findMyCatName2(catName);
	}

}
