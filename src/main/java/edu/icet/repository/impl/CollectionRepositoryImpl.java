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

    @Value("${collection.deleteById}")
    private String deleteByIdSql;



    @Override
    public boolean save(CollectionDto collectionDto ) {

        try {
            int response = jdbcTemplate.update(
                    saveCollectionSql,
                    collectionDto.getId(),
                    collectionDto.getName()

            );

            return (response != 1) ? false:true ;

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
    }

    @Override
    public boolean delete(int id) {
        try {
                int response = jdbcTemplate.update(deleteByIdSql, id);
                return response > 0 ? true:false;

        } catch (DataAccessException e) {
                // log.error("Failed to delete collection", e);
                throw new RuntimeException("Failed to delete collection", e);
        }

    }


}
