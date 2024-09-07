package edu.icet.service;

import edu.icet.dto.CollectionDto;

import java.util.List;


public interface CollectionService {
    boolean addCollection(CollectionDto collection);

    boolean delete(long id);

    List<CollectionDto> getAll();

    CollectionDto findOne(long id);

    boolean updateCollectionById(long id,CollectionDto collectionDto);
}
