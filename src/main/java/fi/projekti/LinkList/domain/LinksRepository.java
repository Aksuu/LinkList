package fi.projekti.LinkList.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LinksRepository extends CrudRepository<Links, Long> {

    List<Links> findByLink(String Link);
    
}