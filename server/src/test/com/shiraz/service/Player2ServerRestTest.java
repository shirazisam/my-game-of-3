package com.shiraz.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by shiraz on 03/10/2019.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class Player2ServerRestTest {

    public static final String SEND_URI = "/send/";
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void givenExample_Send56() throws Exception {
        mockMvc.perform(get(SEND_URI + "56"))
                .andExpect(content().string("19"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void givenExample_Send19() throws Exception {
        mockMvc.perform(get(SEND_URI + "19"))
                .andExpect(content().string("6"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void givenExample_Send6() throws Exception {
        mockMvc.perform(get(SEND_URI + "6"))
                .andExpect(content().string("2"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

}