package com.apress.todo.repository;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.apress.todo.domain.ToDo;

@Repository
public class ToDoRepository implements CommonRepository<ToDo> {
	
	private static final String SQL_INSERT = "insert into todo (id, description, created, modofied, completed) "
			+ "values (:id, :description, :created, :modified, :completed)";
	private static final String SQL_QUERY_FINA_ALL = "select id, description, created, "
			+ " modified, completed from todo";

	@Override
	public ToDo save(ToDo domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ToDo> save(Collection<ToDo> domains) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(ToDo domain) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ToDo findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ToDo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
