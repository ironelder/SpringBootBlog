package com.ironelder.blog.infrastructure.dao;

import com.ironelder.blog.domain.model.entity.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloDao extends JpaRepository <Hello, Integer> {

}