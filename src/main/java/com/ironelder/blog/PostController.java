package com.ironelder.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016-08-30.
 */
@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostDao postDao;

    @RequestMapping("/write")
    public String write(Post post){
        post.setRegDate(new Date());
        return "redirect:/post/" + postDao.save(post).getId();
    }

    @RequestMapping("/list")
    public String list(Model model){
        List<Post> postList = postDao.findAll();
        model.addAttribute("postList", postList);
        return "blog";
    }

    @RequestMapping("/{id}")
    public String view(Model model, @PathVariable Long id){
        Post post = postDao.findOne(id);
        model.addAttribute("post", post);
        return "post";
    }
}