package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping(path = "/post/")
    @ResponseBody

    public String poInd(){
        return "Showing all post";
    }

    @GetMapping(path = "/post/{id}")
    @ResponseBody

    public String poInv(@PathVariable long id){
        return "Showing posy with id of "+ id;
    }

    @GetMapping(path = "/posts/create")
    @ResponseBody

    public String createForm(){
        return "Show form to create post";
    }

    @PostMapping(path = "/posts/create")
    @ResponseBody

    public String newPos(){
        return "New post was created!";
    }





}
