package com.vsita.cp.repository;
import com.vsita.cp.model.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyRepo extends CrudRepository<Topic, Long> {

    List<Topic> findByContent(String heading);

}
