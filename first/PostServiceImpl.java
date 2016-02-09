package com.leo.realtor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.realtor.mapper.PostMapper;
import com.leo.realtor.model.Post;

@Service("postService")
public class PostServiceImpl implements PostService {
	
	@Autowired
	private PostMapper postMapper;
	
	 public Post[] getUserPosts(int id) {
		 	System.out.println("Hello:"+id);
	        return postMapper.getPosts(id);
	    }
}
