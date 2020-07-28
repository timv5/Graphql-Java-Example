package com.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.model.Users;
import com.example.graphql.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserResolver implements GraphQLQueryResolver {

    private final UserServiceImpl userService;

    @Autowired
    public UserResolver(UserServiceImpl userService) {
        this.userService = userService;
    }

    public Users getUser(final String id) {
        return this.userService.getUser(id);
    }

}
