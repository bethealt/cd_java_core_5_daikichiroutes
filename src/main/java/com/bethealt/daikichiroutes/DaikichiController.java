package com.bethealt.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")

public class DaikichiController {
    @RequestMapping("")
    public String welcome(){
        return "Welcome!";
    }

    @RequestMapping("/today")
    public String today() {
        return "Today, you will find luck in your endeavors.";
    }

    @RequestMapping("/tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas.";
    }
    @RequestMapping("/travel/{city}")
    public String travel(
        @PathVariable("city") String cityName) {
            if (cityName == null) {
                return "Congratulations! You will soon travel on a vacation of your dreams.";
            }
            return "Congratulations! You will soon travel to " + cityName + "!";
            }

    @RequestMapping("/lotto/{num}")
    public String lotto(
        @PathVariable("num") int lottoNum) {
            if (lottoNum %2 == 0 ) {
                return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
            }
            else if (lottoNum %2 == 1 ) {
            return "You will take a grand journey in the near future, but be weary of tempting offers.";
            }
            return "You will take a grand journey in the near future, but be weary of tempting offers.";
        }
}

