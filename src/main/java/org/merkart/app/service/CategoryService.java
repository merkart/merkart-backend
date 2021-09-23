package org.merkart.app.service;

import org.merkart.app.controller.dto.CategoryDto;
import org.merkart.app.exception.NotFoundException;
import org.merkart.app.repository.document.Category;

public interface CategoryService {

    Category getById(String id) throws NotFoundException;
    Category save(CategoryDto categoryDto);
    Category update(String id, CategoryDto newCategoryDto) throws NotFoundException;

}
