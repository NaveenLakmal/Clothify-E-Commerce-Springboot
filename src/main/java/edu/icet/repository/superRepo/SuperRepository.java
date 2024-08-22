package edu.icet.repository.superRepo;

import edu.icet.dto.CollectionDto;

import java.util.List;

public interface SuperRepository<T> {

    boolean save(T dto);

    boolean delete(int id);

    List<CollectionDto> getAll();

    boolean update(int id,T dto);
}
