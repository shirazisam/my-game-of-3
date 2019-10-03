package com.shiraz.rest;

import com.shiraz.service.GameOf3Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shiraz on 02/10/2019.
 */
@RestController
public class GameOf3Controller {

    private GameOf3Service gameOf3Service;

    // Look guys, Spring constructor injection - no autowiring required! :)
    private GameOf3Controller(GameOf3Service service) {
        this.gameOf3Service = service;
    }

    @GetMapping(path = "/start")
    public Integer start() {
        return gameOf3Service.getStartNumber();
    }

    @GetMapping(path = "/send/{n}")
    public Integer play(@PathVariable("n") Integer num) {
        return gameOf3Service.getNextNumber(num);
    }
}
