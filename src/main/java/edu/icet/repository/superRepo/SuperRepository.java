package edu.icet.repository.superRepo;

import edu.icet.dto.CollectionDto;

public interface SuperRepository<T> {

    boolean save(T dto);

    boolean delete(int id);
}
