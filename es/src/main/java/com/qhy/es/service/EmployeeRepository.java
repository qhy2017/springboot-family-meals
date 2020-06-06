package com.qhy.es.service;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.qhy.es.entity.Employee;

public interface EmployeeRepository extends ElasticsearchRepository<Employee,String>{

}
