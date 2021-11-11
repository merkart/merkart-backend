package org.merkart.app.service;

import java.util.List;

import org.merkart.app.controller.dto.CategoryDto;
import org.merkart.app.exception.NotFoundException;
import org.merkart.app.repository.CategoryRepository;
import org.merkart.app.repository.documents.Category;
import org.merkart.app.util.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MongoCategoryService implements CategoryService{

    private CategoryRepository categoryRepository;

    @Autowired
    public MongoCategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public Category getById(String id) throws NotFoundException {
        return categoryRepository.findById(id)
                .orElseThrow(NotFoundException::new);
    }

    @Override
    public Category save(CategoryDto categoryDto) {
        return categoryRepository.save(CategoryMapper.toCategory(categoryDto));
    }

    @Override
    public Category update(String id, CategoryDto newCategoryDto) throws NotFoundException {
        return categoryRepository.save(CategoryMapper.updateCategory(getById(id), newCategoryDto));
    }


	@Override
	public List<Category> getAll() {
		return categoryRepository.findAll();
	}
}
