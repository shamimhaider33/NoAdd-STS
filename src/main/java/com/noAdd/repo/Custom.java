package com.noAdd.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.noAdd.data.UserDetails;

public class Custom implements MongoRepository<UserDetails, String>{

	@Override
	public Page<UserDetails> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserDetails> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetails findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<UserDetails> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserDetails entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends UserDetails> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends UserDetails> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDetails> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDetails> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
