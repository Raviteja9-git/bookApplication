
package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
