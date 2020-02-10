package com.duykypaul.service;

import com.duykypaul.dto.NewsDTO;

public interface INewsService {
    NewsDTO save(NewsDTO newsDTO);
    void delete(Long [] ids);
}










