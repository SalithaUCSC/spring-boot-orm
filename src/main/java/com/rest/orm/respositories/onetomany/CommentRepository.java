package com.rest.orm.respositories.onetomany;

import com.rest.orm.entities.onetomany.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
