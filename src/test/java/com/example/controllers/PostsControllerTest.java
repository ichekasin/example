package com.example.controllers;

import com.example.domain.Post;
import com.example.domain.User;
import com.example.domain.repos.PostsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PostsControllerTest {

    @Mock
    private PostsRepository postsRepository;

    @Mock
    private Post post;

    @Mock
    private User user;

    @InjectMocks
    private PostsController postsController;


    @Test
    public void createNewPost() {

        //when(post.setAuthor("author")).thenReturn(null);
        /*Long id = 1l;
        Client expectedClient = new Client(id , "name", "address rn11d", 20);
        when(clientService.getClientById(id)).thenReturn(expectedClient);
        String result = clientListController.addAccountFromForm(id, model);
        assertEquals("redirect:/clients/" + id, result);*/
        /////User user = new User();
        /////user.setLogin("user");
        /////Post post = new Post();

        /////when(postsController.createNewPost("user","content"));
        ////verify(post).setAuthor("user");

        //assertEquals("Successful create new post", postsController.createNewPost("author","content"));

        //when(postsController.createNewPost("author", "content")).thenReturn("Successful create new post");
        //verify(doReturn("Successful create new post"));
    }

    @Test
    public void getAllPosts() {
        postsController.getAllPosts();
        verify(postsRepository).findAll();
    }
}