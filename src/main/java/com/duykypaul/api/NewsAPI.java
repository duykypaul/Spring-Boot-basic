package com.duykypaul.api;

import com.duykypaul.dto.NewsDTO;
import com.duykypaul.service.impl.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewsAPI {
    @Autowired
    private NewsService newsService;

    @PostMapping(value = "/news")
    public NewsDTO createNews(@RequestBody NewsDTO model){
        return newsService.save(model);
    }

    @PutMapping(value = "/news")
    public NewsDTO updateNews(@RequestBody NewsDTO model){
        return model;
    }

    @DeleteMapping(value = "/news")
    public void deleteNews(@RequestBody long[] ids){

    }

}
