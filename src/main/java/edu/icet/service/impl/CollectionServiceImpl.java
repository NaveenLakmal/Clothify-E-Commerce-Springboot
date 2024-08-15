package edu.icet.service.impl;

import edu.icet.entity.Collection;
import edu.icet.repository.CollectionRepository;
import edu.icet.service.CollectionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CollectionServiceImpl implements CollectionService {

    final ModelMapper modelMapper;
    final CollectionRepository collectionRepository;
    @Override
    public void addCollection(Collection collectionDto) {
        Collection collection = modelMapper.map(collectionDto, Collection.class);
        collectionRepository.save(collection);

    }
}
