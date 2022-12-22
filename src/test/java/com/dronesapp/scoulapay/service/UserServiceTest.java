package com.dronesapp.scoulapay.service;

import com.dronesapp.scoulapay.model.User;
import com.dronesapp.scoulapay.repository.UserRespository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    private UserService userService;

    @MockBean
    private UserRespository userRespository;

    @BeforeEach
    void setUp() {
        User user = User.builder()
                .userName("Bundasliga")
                .userEmail("budasliga@gmail.com")
                .userPhoneNo("234323452")
                .build();
        Mockito.when(userRespository.findByUserName("Bundasliga")).thenReturn(user);
    }

    @Test
    public void whenValidateUserName_thenUserShouldReturn() {
        String userName = "Bundasliga";
        User found = userService.getUserByName(userName);

        assertEquals(userName, found.getUserName());
    }

}