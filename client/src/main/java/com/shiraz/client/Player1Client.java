package com.shiraz.client;

import org.springframework.web.client.RestTemplate;

import java.util.Random;

import static java.lang.Math.*;

/**
 * Created by shiraz on 02/10/2019.
 */
public class Player1Client {

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        // request a starting number from the server if not provided as argument..
        Integer value = args.length > 0 ? Integer.parseInt(args[0]) :  restTemplate.getForObject("http://localhost:8080/start", Integer.class);
        System.out.println("Player1: starting value obtained = " + value);

        while (value > 1) {
            System.out.println("Player1: sending value " + value);
            value = restTemplate.getForObject("http://localhost:8080/send/" + value, Integer.class);
            System.out.println("Player1: value received from Player2 = " + value);
            value = toIntExact(round(((double) value) / 3));  // thanks Nick ;)
        }
        if (value == 1) {
            System.out.println("Player1: WINNER!");
        }
    }

    public Integer getStartNumber() {
        return new Random().nextInt(10000) + 1;
    }


}
