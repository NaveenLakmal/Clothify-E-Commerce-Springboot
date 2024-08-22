package edu.icet.repository.impl;

import edu.icet.dto.CollectionDto;
import edu.icet.repository.CollectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CollectionRepositoryImpl implements CollectionRepository {

    private final JdbcTemplate jdbcTemplate;


    @Value("${collection.getMaxId}")
    private String getMaxIdQuery;

    @Value("${collection.saveCollection}")
    private String saveCollectionSql;



    @Override
    public boolean save(CollectionDto collectionDto, int id) {
        collectionDto.setId(id);
        try {
         jdbcTemplate.update(
                saveCollectionSql,
                collectionDto.getId(),
                collectionDto.getName()

        );

         return  true;

        } catch (DataAccessException e) {
            //log.error("Failed to create collection", e);
            throw  new Error("Failed to create collection", e);
        }
    }

    @Override
    public Integer getMaxId() {
        String maxIdSql = getMaxIdQuery;
        Integer maxId = jdbcTemplate.queryForObject(maxIdSql, Integer.class);
        return  maxId;
        //return (maxId !=null) ? maxId + 1 : 1 ;
    }


}
