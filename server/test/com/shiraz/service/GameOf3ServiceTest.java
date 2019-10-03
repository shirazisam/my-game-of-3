package com.shiraz.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by shiraz on 03/10/2019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class GameOf3ServiceTest {

    @Autowired
    GameOf3Service gameOf3Service;

    @Test
    public void getNextNumberTest() throws Exception {
        assertEquals(19, gameOf3Service.getNextNumber(56).intValue());
        assertEquals(6, gameOf3Service.getNextNumber(19).intValue());
        assertEquals(2, gameOf3Service.getNextNumber(6).intValue());
        assertEquals(-1, gameOf3Service.getNextNumber(2).intValue());  // -1 indicates win
    }
}