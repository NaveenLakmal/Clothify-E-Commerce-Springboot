package edu.icet.controller;

import edu.icet.dto.CategoryDto;
import edu.icet.dto.CollectionDto;
import edu.icet.service.CategoryService;
import edu.icet.service.CollectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin
@RequiredArgsConstructor
public class CategoryController {

    final CategoryService categoryService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addCategory(@RequestBody CategoryDto categoryDto){
        return categoryService.addCategory(categoryDto);
    }

    @DeleteMapping("delete/{id}")
    public  boolean deleteCategoryById(@PathVariable int id){
        return categoryService.delete(id);
    }

    @GetMapping("/get-all")
    public List<CategoryDto> getAllCategory(){
        return categoryService.getAll();
    }

    @PatchMapping("update/{id}")
    public boolean updateCategoryById(@PathVariable int id,@RequestBody CategoryDto categoryDto){
        return  categoryService.updateCategoryById(id,categoryDto);
    }
}
