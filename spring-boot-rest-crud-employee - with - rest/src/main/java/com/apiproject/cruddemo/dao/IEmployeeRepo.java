package com.apiproject.cruddemo.dao;

import com.apiproject.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="members")
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {
}
