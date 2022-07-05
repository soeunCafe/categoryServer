package com.soeun.category.controller;

import com.soeun.category.model.CategoryDto;
import com.soeun.category.repositiory.CategoryMapper;
import com.soeun.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

//    전체 카테고리 조회
    @GetMapping
    public List<CategoryDto> selectCategory() {
        return categoryService.selectCategory();
    }

//카테고리 조회
    @GetMapping("/{Id}")
    public CategoryDto getCategory(@PathVariable Integer Id) {
        return categoryService.getCategory(Id);
    }

//    카테고리 저장
    @PostMapping
    public CategoryDto saveCategory(@RequestBody CategoryDto categoryDto) {
        return categoryService.saveCategory(categoryDto);
    }

//    카테고리 수정
    @PutMapping("/{Id}")
    public CategoryDto updateCategory(@PathVariable Integer Id, @RequestBody CategoryDto categoryDto) {
        return categoryService.updateCategory(Id, categoryDto);
    }

//    카테고리 삭제
    @DeleteMapping("/{Id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCategory(@PathVariable Integer Id) {
        categoryService.deleteCategory(Id);
    }

}
