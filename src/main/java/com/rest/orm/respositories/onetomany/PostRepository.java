package com.rest.orm.respositories.onetomany;

import com.rest.orm.entities.onetomany.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
