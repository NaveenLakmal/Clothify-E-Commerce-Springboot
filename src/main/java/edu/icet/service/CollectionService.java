package edu.icet.service;

import edu.icet.dto.CollectionDto;

import java.util.List;


public interface CollectionService {
    boolean addCollection(CollectionDto collection);

    boolean delete(int id);

    List<CollectionDto> getAll();
}
