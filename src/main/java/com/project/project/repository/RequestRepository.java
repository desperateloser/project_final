package com.project.project.repository;

import com.project.project.model.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository <Request, Long> {
}
