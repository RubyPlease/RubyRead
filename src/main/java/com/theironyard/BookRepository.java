package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by RobertBarber on 6/6/16.
 */
public interface BookRepository extends CrudRepository<Book, Integer> {
}
