package com.rest.orm.services.onetomany;

import com.rest.orm.entities.onetomany.Post;
import com.rest.orm.respositories.onetomany.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElseThrow(() -> new RuntimeException("Post Not Found!"));
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

}
