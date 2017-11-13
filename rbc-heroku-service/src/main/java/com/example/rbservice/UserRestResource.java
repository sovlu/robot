package com.example.rbservice;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;


@RepositoryRestResource(path = "robot", collectionResourceRel = "robot")
interface UserRestResource extends PagingAndSortingRepository<Robot, Long> {

    public Optional<Robot> findById(@Param("id") Long id);

    public List<Robot> findAll();

    public void deleteById(@Param("id") Long id);



}
