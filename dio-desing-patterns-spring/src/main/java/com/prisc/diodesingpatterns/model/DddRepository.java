package com.prisc.diodesingpatterns.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DddRepository extends CrudRepository<RegiaoDdd, Long> {
}
