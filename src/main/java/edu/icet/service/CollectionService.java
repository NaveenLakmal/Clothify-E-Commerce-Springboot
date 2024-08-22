package edu.icet.service;

import edu.icet.dto.CollectionDto;


public interface CollectionService {
    boolean addCollection(CollectionDto collection);

    boolean delete(int id);
}
