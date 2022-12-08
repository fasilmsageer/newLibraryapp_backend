package com.nest.newlibraryapp_backend.dao;

import com.nest.newlibraryapp_backend.model.Books;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BooksDao extends CrudRepository<Books, Integer> {

    @Query(value = "SELECT `id`, `author`, `description`, `distributer`, `image`, `language`, `price`, `publisher`, `releasedyear`, `title` FROM `books` WHERE `title` LIKE %:title%",nativeQuery = true)
    List<Books> SearchBook(@Param("title") String title);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `books` WHERE `id` =:id",nativeQuery = true)
    void DeleteBook(@Param("id")Integer id);
}
