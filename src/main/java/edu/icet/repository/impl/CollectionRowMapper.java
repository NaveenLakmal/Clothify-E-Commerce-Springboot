package edu.icet.repository.impl;

import edu.icet.dto.CollectionDto;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CollectionRowMapper implements RowMapper <CollectionDto>{

    @Override
    public CollectionDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        CollectionDto dto=new CollectionDto();
        dto.setId(rs.getInt("id"));
        dto.setName(rs.getString("name"));
        return  dto;
    }
}
