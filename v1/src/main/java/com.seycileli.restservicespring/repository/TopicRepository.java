package com.seycileli.restservicespring.repository;

import com.seycileli.restservicespring.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, String> { }
