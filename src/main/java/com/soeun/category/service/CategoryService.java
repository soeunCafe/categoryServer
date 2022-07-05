package com.soeun.category.service;

import com.soeun.category.model.CategoryDto;
import com.soeun.category.repositiory.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;


    public List<CategoryDto> selectCategory() {
        return categoryMapper.findAll();
    }

    public CategoryDto getCategory(Integer Id) {
        return categoryMapper.findById(Id).orElseThrow(IllegalArgumentException::new);
    }

    public CategoryDto saveCategory(CategoryDto categoryDto) {
        return categoryMapper.save(categoryDto);
    }

    public void deleteCategory(Integer Id) {
        categoryMapper.deleteById(Id);
    }

    @Transactional
    public CategoryDto updateCategory(Integer Id, CategoryDto categoryDto) {
        CategoryDto categoryData = categoryMapper.findById(Id).orElseThrow(IllegalArgumentException::new);
        categoryData.update(categoryDto.getCafeid(),categoryDto.getName());
        return categoryData;
    }



}
