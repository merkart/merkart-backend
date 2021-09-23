package org.merkart.app.util;

import org.merkart.app.controller.dto.CategoryDto;
import org.merkart.app.repository.Document.Category;

public class CategoryMapper {

    public static Category toCategory(CategoryDto categoryDto) {
        Category newCategory = new Category();
        newCategory.setName(categoryDto.getName());
        newCategory.setDescription(categoryDto.getDescription());
        newCategory.setCreatedAt(categoryDto.getCreatedAt());
        return newCategory;
    }

    public static CategoryDto toCategoryDto(Category category) {
        CategoryDto newCategoryDto = new CategoryDto();
        newCategoryDto.setName(category.getName());
        newCategoryDto.setDescription(category.getDescription());
        newCategoryDto.setCreatedAt(category.getCreatedAt());
        return newCategoryDto;
    }

    public static Category updateCategory(Category category, CategoryDto categoryDto) {
        Category updatedCategory = new Category();
        updatedCategory.setId(category.getId());
        updatedCategory.setName((categoryDto.getName()!= null) ? categoryDto.getName(): category.getName());
        updatedCategory.setDescription((category.getDescription()!=null) ? category.getDescription(): category.getDescription());
        updatedCategory.setCreatedAt((categoryDto.getCreatedAt()!=null) ? categoryDto.getCreatedAt(): category.getCreatedAt());
        return updatedCategory;
    }

}
