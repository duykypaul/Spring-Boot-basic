package com.duykypaul.converter;

import com.duykypaul.dto.NewsDTO;
import com.duykypaul.entity.NewsEntity;
import org.springframework.stereotype.Component;

@Component
public class NewsConverter {
    /*public NewsEntity toEntity(NewsDTO newsDTO){
        NewsEntity newsEntity = new NewsEntity();
        newsEntity.setTitle(newsDTO.getTitle());
        newsEntity.setContent(newsDTO.getContent());
        newsEntity.setShortDescription(newsDTO.getShortDescription());
        newsEntity.setThumbnail(newsDTO.getThumbnail());
        newsEntity.setCreatedAt(newsDTO.getCreatedAt());
        newsEntity.setCreatedBy(newsDTO.getCreatedBy());
        newsEntity.setModifiedAt(newsDTO.getModifiedAt());
        newsEntity.setModifiedBy(newsDTO.getModifiedBy());
        return newsEntity;
    }*/

    /*public NewsDTO toDTO(NewsEntity newsEntity){
        NewsDTO newsDTO = new NewsDTO();
        newsDTO.setTitle(newsEntity.getTitle());
        newsDTO.setContent(newsEntity.getContent());
        newsDTO.setShortDescription(newsEntity.getShortDescription());
        newsDTO.setThumbnail(newsEntity.getThumbnail());
        newsDTO.setCreatedAt(newsEntity.getCreatedAt());
        newsDTO.setCreatedBy(newsEntity.getCreatedBy());
        newsDTO.setModifiedAt(newsEntity.getModifiedAt());
        newsDTO.setModifiedBy(newsEntity.getModifiedBy());
        return newsDTO;
    }*/

    public NewsEntity oldToNew (NewsEntity old, NewsEntity newt){
        old.setTitle(newt.getTitle());
        old.setContent(newt.getContent());
        old.setShortDescription(newt.getShortDescription());
        old.setThumbnail(newt.getThumbnail());
        old.setCreatedAt(newt.getCreatedAt());
        old.setCreatedBy(newt.getCreatedBy());
        old.setModifiedAt(newt.getModifiedAt());
        old.setModifiedBy(newt.getModifiedBy());
        return old;
    }
}
