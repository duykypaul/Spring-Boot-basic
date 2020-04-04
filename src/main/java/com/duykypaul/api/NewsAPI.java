package com.duykypaul.api;

import com.duykypaul.dto.NewsDTO;
import com.duykypaul.service.impl.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news")
public class NewsAPI {
    @Autowired
    private NewsService newsService;

    @PostMapping
    public NewsDTO createNews(@RequestBody NewsDTO model){
        return newsService.save(model);
    }

    @PutMapping(value = "/{id}")
    public NewsDTO updateNews(@RequestBody NewsDTO model, @PathVariable("id") Long id){
        model.setId(id);
        return newsService.save(model);
    }

    @DeleteMapping
    public void deleteNews(@RequestBody Long[] ids){
        newsService.delete(ids);
    }

    @GetMapping(value = "/{id}")
    public NewsDTO findById(@PathVariable Long id) {
        return newsService.findById(id);
    }

}
