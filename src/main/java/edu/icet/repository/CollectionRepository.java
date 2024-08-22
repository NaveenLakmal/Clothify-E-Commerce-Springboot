package edu.icet.repository;

import edu.icet.dto.CollectionDto;


import java.util.List;


public interface CollectionRepository {

 Integer getMaxId();

 boolean save(CollectionDto collectionDto,int id);
}
