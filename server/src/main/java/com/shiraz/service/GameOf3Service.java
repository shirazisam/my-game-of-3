package com.shiraz.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by shiraz on 02/10/2019.
 */
@Slf4j
@Service
public class GameOf3Service {

    private static final int I_WIN_AND_YOU_LOOSE = -1;

    public Integer getStartNumber() {
        return new Random().nextInt(10000) + 1;
    }

    public Integer getNextNumber(Integer num) {
        log.info("Player2: value received from Player1 = " + num);
        long newValue = Math.round(((double) num) / 3); // thanks to Nick for this!
        if (newValue == 1) {
            log.info("Player2: WINNER!");
            return I_WIN_AND_YOU_LOOSE;
        }
        log.info("Player2: sending newValue = {}", newValue);
        return Math.toIntExact(newValue);

    }
}
