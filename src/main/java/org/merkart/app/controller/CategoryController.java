package org.merkart.app.controller;

import org.merkart.app.controller.dto.CategoryDto;
import org.merkart.app.repository.document.Category;
import org.merkart.app.service.CategoryService;
import org.merkart.app.util.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable String id) {
        try {
            return ResponseEntity.ok()
                    .body(categoryService.getById(id));
        } catch (Exception ex) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping
    public ResponseEntity<Category> saveCategory(@RequestBody CategoryDto newCategory){
        try {
            return new ResponseEntity<>(categoryService.save(newCategory), HttpStatus.CREATED);
        } catch (Exception ex) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable String id, @RequestBody CategoryDto categoryDto) {
        try {
            return ResponseEntity.accepted().
                    body(categoryService.update(id, categoryDto));
        } catch (Exception ex) {
            return ResponseEntity.internalServerError().build();
        }
    }

}
