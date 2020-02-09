package com.duykypaul.service.impl;

import com.duykypaul.dto.CategoryDTO;
import com.duykypaul.entity.CategoryEntity;
import com.duykypaul.repository.CategoryRepository;
import com.duykypaul.service.ICategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public CategoryDTO save(CategoryDTO categoryDTO) {
        CategoryEntity categoryEntity = modelMapper.map(categoryDTO, CategoryEntity.class);
        categoryRepository.save(categoryEntity);
        return modelMapper.map(categoryEntity, CategoryDTO.class);
    }
}
