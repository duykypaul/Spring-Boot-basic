package com.duykypaul.converter;


import com.duykypaul.entity.CategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter {

    public CategoryEntity oldToNew (CategoryEntity old, CategoryEntity newt){
        old.setCode(newt.getCode());
        old.setName(newt.getName());
        return old;
    }
}
