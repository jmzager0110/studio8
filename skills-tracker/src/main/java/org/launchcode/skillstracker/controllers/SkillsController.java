package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skills() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn, here is the list:</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<li>Java</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping(value="form")
    @ResponseBody
    public String skillForm(){
//        return  "<html>" +
//                "<body>" +
//                "<form action=\"form\" method=\"post\">" +
//                "<label>Name:" +
//                "<input type='text' name='name>" +
//                "</label>\n" +
//                "<input type='submit' value='submit'>" +
//                "<label>Select your most favorite language:" +
//                "<select name='firstFavorite' id='firstFavorite>\n" +
//                "<option value=''>* Select One *</option>\n" +
//                "<option value='1'>JavaScript</option>\n" +
//                "<option value='2'>Python</option>\n" +
//                "<option value='3'>Java</option>\n" +
//                "<label>Select your 2nd most favorite language:" +
//                "<select name='secFav' id='secFav>\n" +
//                "<option value=''>* Select One *</option>\n" +
//                "<option value='1'>JavaScript</option>\n" +
//                "<option value='2'>Python</option>\n" +
//                "<option value='3'>Java</option>\n" +
//                "<label>Select your 3rd most favorite language:" +
//                "<select name='thirdFav' id='thirdFav>\n" +
//                "<option value=''>* Select One *</option>\n" +
//                "<option value='1'>JavaScript</option>\n" +
//                "<option value='2'>Python</option>\n" +
//                "<option value='3'>Java</option>\n" +
//                "</select>" +
//                "</label>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
        return "<html>" +
                "<body>" + "<form action=\"form\" method=\"post\">\n" +
                "  <label for=\"fname\">Firstname:</label><br>\n" +
                "  <input type=\"text\" name=\"name\"><br>\n" +
                "  <label>My Favorite Language:</label><br>\n" +
                "  <select name=\"firstChoice\">\n" +
                "  <option value=\"javascript\">Javascript</option>\n" +
                "  <option value=\"java\">Java</option>\n" +
                "  <option value=\"python\">Python</option>\n" +
                "</select><br>\n" +
                "  <label>My Second Favorite Language:</label><br>\n" +
                "  <select name=\"secondChoice\">\n" +
                "  <option value=\"javascript\">Javascript</option>\n" +
                "  <option value=\"java\">Java</option>\n" +
                "  <option value=\"python\">Python</option>\n" +
                "</select><br>\n" +
                "  <label>My Third Favorite Language:</label><br>\n" +
                "  <select name=\"thirdChoice\">\n" +
                "  <option value=\"javascript\">Javascript</option>\n" +
                "  <option value=\"java\">Java</option>\n" +
                "  <option value=\"python\">Python</option>\n" +
                "</select><br>\n" +
                "  <input type=\"submit\">\n" +
                "\n" +
                "</form>" +
                "</body>" +
                "</html>";

    }
    @PostMapping(value= "form")
    @ResponseBody
    public String skillPost(@RequestParam String name, String firstChoice, String secondChoice, String thirdChoice) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<h1>" + firstChoice + "</h1>" +
                "<h1>" + secondChoice + "</h1>" +
                "<h1>" + thirdChoice + "</h1>" +
                "</body>" +
                "</html>";
    }

}
