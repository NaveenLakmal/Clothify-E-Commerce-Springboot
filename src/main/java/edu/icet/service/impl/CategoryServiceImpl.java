package edu.icet.service.impl;

import edu.icet.dto.CategoryDto;
import edu.icet.dto.CollectionDto;
import edu.icet.entity.Category;
import edu.icet.entity.Collection;
import edu.icet.repository.CategoryRepository;
import edu.icet.repository.CollectionRepository;
import edu.icet.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    final ModelMapper modelMapper;
    final CategoryRepository categoryRepository;

    @Override
    public boolean addCategory(CategoryDto categoryDto) {
        Category category = modelMapper.map(categoryDto, Category.class);
        return (categoryRepository.save(category)) != null;


    }

    @Override
    public boolean delete(long id) {
        if(categoryRepository.existsById(id)){
            categoryRepository.deleteById(id);
            return true;
        }
        return false;


    }

    @Override
    public List<CategoryDto> getAll() {
        List<CategoryDto> categoryDtoList=new ArrayList<>();

        Iterable<Category> categories = categoryRepository.findAll();

        Iterator<Category> categoryIterator = categories.iterator();

        while (categoryIterator.hasNext()){
            Category category = categoryIterator.next();
            CategoryDto categoryDto = modelMapper.map(category, CategoryDto.class);
            categoryDtoList.add(categoryDto);
        }
        return categoryDtoList;

    }

    @Override
    public boolean updateCategoryById(long id, CategoryDto categoryDto) {
        Optional<Category> existCategory = categoryRepository.findById(id);

        if(existCategory.isPresent()){
            Category category = existCategory.get();

            category.setName(categoryDto.getName());
            category.setParentId(categoryDto.getParentId());
            categoryRepository.save(category);
            return true;
        }
        return false;

    }
}
