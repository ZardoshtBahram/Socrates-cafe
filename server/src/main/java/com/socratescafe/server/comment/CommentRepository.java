package com.socratescafe.server.comment;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "comment", path = "comment")
public interface CommentRepository extends CrudRepository<Comment, Long> {
    // extend so we can return the number of rows deleted
    @Modifying
    @Transactional
    @Query("delete from Comment where id = ?1")
    int deleteOne(Long commentid);
}