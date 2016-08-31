package com.ironelder.blog.infrastructure.dao;

import com.ironelder.blog.domain.model.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-08-30.
 */
public interface PostDao extends JpaRepository<Post, Long> {
}
