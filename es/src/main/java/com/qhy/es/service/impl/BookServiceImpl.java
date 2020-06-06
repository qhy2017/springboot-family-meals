package com.qhy.es.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.qhy.es.dao.BookRepository;
import com.qhy.es.entity.BookBean;
import com.qhy.es.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
    @Qualifier("bookRepository")
    private BookRepository bookRepository;
	
	@Override
	public Optional<BookBean> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookBean save(BookBean blog) {
		BookBean book = new BookBean();
		book.setId(UUID.randomUUID().toString().substring(0, 6));
		book.setTitle("笑傲江湖");
		BookBean save = bookRepository.save(book);
		return save;
	}

	@Override
	public void delete(BookBean blog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<BookBean> findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookBean> findAll() {
		// TODO Auto-generated method stub
		Iterable<BookBean> findAll = bookRepository.findAll();
		List<BookBean> list = new ArrayList<BookBean>();
		for(BookBean item : findAll) {
			list.add(item);
		}
		return list;
	}

	@Override
	public Page<BookBean> findByAuthor(String author, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<BookBean> findByTitle(String title, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
