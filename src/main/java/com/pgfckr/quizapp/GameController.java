package com.pgfckr.quizapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/game")
public class GameController {
    @RequestMapping("/load")
    public String load() {
        return "<div>Http Hierhin</div>";
    }

    @RequestMapping(path = "/answer", method = RequestMethod.POST)
    public void answer() {
        // write stuff to database
    }
}
