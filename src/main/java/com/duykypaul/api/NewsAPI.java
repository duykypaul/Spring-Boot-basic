package com.duykypaul.api;

import com.duykypaul.dto.NewsDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewsAPI {
    @PostMapping(value = "/news")
    public NewsDTO createNews(@RequestBody NewsDTO model){
        return model;
    }

    @PutMapping(value = "/news")
    public NewsDTO updateNews(@RequestBody NewsDTO model){
        return model;
    }

    @DeleteMapping(value = "/news")
    public void deleteNews(@RequestBody long[] ids){

    }

}
