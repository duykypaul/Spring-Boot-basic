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

    @PutMapping(value = "/news/{id}")
    public NewsDTO updateNews(@RequestBody NewsDTO model, @PathVariable("id") Long id){
        model.setId(id);
        return newsService.save(model);
    }

    @DeleteMapping(value = "/news")
    public void deleteNews(@RequestBody Long[] ids){
        newsService.delete(ids);
    }

}
