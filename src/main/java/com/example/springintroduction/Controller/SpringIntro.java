package com.example.springintroduction.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@RestController
public class SpringIntro {


    //Exercise 1 Create an endpoint that greets the user with a friendly message
    @GetMapping("/firstMapping")
    public String friendlyMessage(){
        return "friendly message";
    }

    //Exercise 2 Create an endpoint that echo’s the users GET parameter from the URL
    @GetMapping("/secondMapping")
    public String echoInput(@RequestParam String input){
        return input;
    }

    @GetMapping("/thirdMapping")
    public String erDetFredag(){

        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get((Calendar.DAY_OF_WEEK));
        String ja = "det er fredag";
        String nej = "det er ikke fredag";

        if (dayOfWeek == 6) {
            return ja;
        }else {
            return nej;
        }

    }

}
