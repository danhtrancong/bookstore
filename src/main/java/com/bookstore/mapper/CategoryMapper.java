package com.bookstore.mapper;

import com.bookstore.dto.CategoryDTO;
import com.bookstore.entity.CategoryEntity;

import java.util.ArrayList;
import java.util.List;

public class CategoryMapper {

    public static CategoryDTO mapFromEntity(CategoryEntity categoryEntity) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName(categoryEntity.getName());
        categoryDTO.setId(categoryEntity.getId());
        return categoryDTO;
    }

    public static List<CategoryDTO> mapFromEntities(List<CategoryEntity> categoryEntities) {
        List<CategoryDTO> categoryDTOList = new ArrayList<>();
        for (CategoryEntity temp : categoryEntities) {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setName(temp.getName());
//            categoryDTO.setId(temp.getId());
          categoryDTOList.add(categoryDTO);
        }
        return categoryDTOList;
    }
}
