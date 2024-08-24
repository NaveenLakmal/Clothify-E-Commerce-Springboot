package edu.icet.service;

import edu.icet.dto.CategoryDto;
import edu.icet.dto.CollectionDto;

import java.util.List;

public interface CategoryService {
    boolean addCategory(CategoryDto categoryDto);

    boolean delete(long id);

    List<CategoryDto> getAll();

    boolean updateCategoryById(long id, CategoryDto categoryDto);
}
