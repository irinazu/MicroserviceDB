package com.courseproject.microservice.repository;

//import com.courseproject.microservice.model.Attribute;
import com.courseproject.microservice.model.Object;
import com.courseproject.microservice.model.ObjectType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


public interface ObjectTypeRepository extends JpaRepository<ObjectType,Long> {
    @Override
    List<ObjectType> findAll();

    @Override
    List<ObjectType> findAllById(Iterable<Long> longs);

    @Override
    Optional<ObjectType> findById(Long aLong);

}
