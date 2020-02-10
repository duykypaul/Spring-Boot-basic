package com.duykypaul.service.impl;

import com.duykypaul.converter.NewsConverter;
import com.duykypaul.dto.NewsDTO;
import com.duykypaul.entity.CategoryEntity;
import com.duykypaul.entity.NewsEntity;
import com.duykypaul.repository.CategoryRepository;
import com.duykypaul.repository.NewsRepository;
import com.duykypaul.service.INewsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService implements INewsService {
    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private NewsConverter newsConverter;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public NewsDTO save(NewsDTO newsDTO) {
        NewsEntity newsEntity = modelMapper.map(newsDTO, NewsEntity.class);
        if(newsDTO.getId() != null){
            newsEntity = newsConverter.oldToNew(newsRepository.findOne(newsDTO.getId()),
                        modelMapper.map(newsDTO, NewsEntity.class));
        }
        CategoryEntity categoryEntity = categoryRepository.findOneByCode(newsDTO.getCategoryCode());
        newsEntity.setCategory(categoryEntity);
        return modelMapper.map(newsRepository.save(newsEntity), NewsDTO.class);
    }

    @Override
    public void delete(Long[] ids) {
        for(Long item : ids){
            newsRepository.delete(item);
        }
    }
}
