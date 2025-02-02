package com.anderson.inventory.repositories;

import com.anderson.inventory.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    // select * from author where first_name = 'ande'
    List<Author> findAllByFirstName(String fn);

    // select * from author where first_name = 'ander'
    List<Author> findAllByFirstNameIgnoreCase(String fn);

    // select * from author where firs_name like '%and%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);

    // select * from author where first_name like 'and%'
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String firstName);

    // select * from author where first_name like '%and'
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String firstName);

    // select * from author where first_name in ('anderson', 'jose', 'joe')
    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);


}
