package edu.icet.repository;

import edu.icet.dto.CollectionDto;
import edu.icet.repository.superRepo.SuperRepository;


import java.util.List;


public interface CollectionRepository extends SuperRepository<CollectionDto> {

 Integer getMaxId();



}
