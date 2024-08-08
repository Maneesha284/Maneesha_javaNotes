package com.ojas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entity.BookEntity;

@Repository//optional
public interface BookDaoRepository extends JpaRepository<BookEntity,Integer> {

}
