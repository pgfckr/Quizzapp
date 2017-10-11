package com.pgfckr.quizapp;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/game")
public class GameController {
    @RequestMapping("/load")
    public String load() {
        return "<start>";
    }

    @RequestMapping(path = "/answer", method = RequestMethod.POST)
    public boolean answer(@RequestBody int answerIndex) {
        // write stuff to database
        return answerIndex == 2;
    }
}
