package com.qhy.es.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.qhy.es.entity.BookBean;

public interface BookRepository extends ElasticsearchRepository<BookBean, String>{

}
