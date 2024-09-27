package com.socratescafe.server.article;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "articles", path = "articles")
public interface ArticleRepository extends CrudRepository<Article, Long> {
    // extend so we can return the number of rows deleted
    @Modifying
    @Transactional
    @Query("delete from Article where id = ?1")
    int deleteOne(Long articleid);
}
