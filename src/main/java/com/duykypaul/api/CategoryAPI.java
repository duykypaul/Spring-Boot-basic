package com.duykypaul.api;

import com.duykypaul.dto.CategoryDTO;
import com.duykypaul.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryAPI {
    @Autowired
    private CategoryService categoryService;

    @PostMapping(value = "/category")
    public CategoryDTO createCategory(@RequestBody CategoryDTO model){
        return categoryService.save(model);
    }

    @PutMapping(value = "/category")
    public CategoryDTO updateCategory(@RequestBody CategoryDTO model, @PathVariable("id") Long id){
        model.setId(id);
        return categoryService.save(model);
    }

    @DeleteMapping(value = "/category")
    public void deleteCategory(@RequestBody long[] ids){

    }

}
