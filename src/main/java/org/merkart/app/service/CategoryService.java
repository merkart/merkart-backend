package org.merkart.app.service;

import java.util.List;

import org.merkart.app.controller.dto.CategoryDto;
import org.merkart.app.exception.NotFoundException;
import org.merkart.app.repository.documents.Category;

public interface CategoryService {

    Category getById(String id) throws NotFoundException;
    List<Category> getAll();
    Category save(CategoryDto categoryDto);
    Category update(String id, CategoryDto newCategoryDto) throws NotFoundException;

}
