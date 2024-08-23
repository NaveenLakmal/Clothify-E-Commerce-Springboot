package edu.icet.service.impl;

import edu.icet.dto.CollectionDto;

import edu.icet.entity.Collection;
import edu.icet.repository.CollectionRepository;
import edu.icet.service.CollectionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CollectionServiceImpl implements CollectionService {

    final ModelMapper modelMapper;
    final CollectionRepository collectionRepository;

    @Override
    public boolean addCollection(CollectionDto collectionDto) {
        Collection collection = modelMapper.map(collectionDto, Collection.class);
        return (collectionRepository.save(collection)) != null;


    }

    @Override
    public boolean delete(long id) {
        if(collectionRepository.existsById(id)){
            collectionRepository.deleteById(id);
            return true;
        }
        return false;


    }

    @Override
    public List<CollectionDto> getAll() {
        return null;
    }

    @Override
    public boolean updateCollectionById(int id, CollectionDto collectionDto) {
        return false;
    }


}

