package edu.icet.service.impl;

import edu.icet.dto.CollectionDto;

import edu.icet.entity.Collection;
import edu.icet.repository.CollectionRepository;
import edu.icet.service.CollectionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

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
        List<CollectionDto> collectionDtoList=new ArrayList<>();

        Iterable<Collection> collections = collectionRepository.findAll();

        Iterator<Collection> collectionIterator = collections.iterator();

        while (collectionIterator.hasNext()){
            Collection collection = collectionIterator.next();
            CollectionDto collectionDto = modelMapper.map(collection, CollectionDto.class);
            collectionDtoList.add(collectionDto);
        }
            return collectionDtoList;

    }

    @Override
    public CollectionDto findOne(long id) {
        Optional<Collection> existCollection = collectionRepository.findById(id);



        // Convert Collection entity to CollectionDto and return
        Collection collection = existCollection.get();
        return convertToDto(collection);
    }

    private CollectionDto convertToDto(Collection collection) {
        CollectionDto dto = new CollectionDto();
        //dto.setId(collection.getId());
        dto.setName(collection.getName());
        // Map other fields as needed
        return dto;
    }

    @Override
    public boolean updateCollectionById(long id, CollectionDto collectionDto) {
        Optional<Collection> existCollection = collectionRepository.findById(id);

        if(existCollection.isPresent()){
            Collection collection = existCollection.get();

            collection.setName(collectionDto.getName());
            collectionRepository.save(collection);
            return true;
        }
        return false;
        
    }


}

