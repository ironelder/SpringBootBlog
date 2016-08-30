package com.ironelder.blog;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-08-30.
 */
public interface PostDao extends JpaRepository<Post, Long> {
}
