package edu.icet.service.impl;

import edu.icet.dto.CollectionDto;

import edu.icet.repository.CollectionRepository;
import edu.icet.service.CollectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CollectionServiceImpl implements CollectionService {

   // final ModelMapper modelMapper;
    final CollectionRepository collectionRepository;

    @Override
    public boolean addCollection(CollectionDto collectionDto) {
        int id=generateId();
        collectionDto.setId(id);
        return collectionRepository.save(collectionDto);

    }

    @Override
    public boolean delete(int id) {
        return collectionRepository.delete(id);
    }

    private int generateId() {
        Integer id= collectionRepository.getMaxId();

        return (id != null) ? id + 1 : 1;


    }
}
