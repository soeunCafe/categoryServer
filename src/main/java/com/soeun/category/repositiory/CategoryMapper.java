package com.soeun.category.repositiory;


import com.soeun.category.model.CategoryDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;


@Mapper
public interface CategoryMapper extends JpaRepository<CategoryDto, Integer> {

}
