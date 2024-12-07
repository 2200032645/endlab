package com.klef.jfsd.labendexam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CliController {

    @RequestMapping("/welcome")
    public String welcome() {
        return "greeting"; 
    }

    @RequestMapping("/test")
    public String renderTest() {
        return "test"; 
    }

    @RequestMapping("/showInfo")
    public String showInfo(@RequestParam("id") int id, @RequestParam("name") String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showInfo"; 
    }

    @RequestMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable("num1") int num1, @PathVariable("num2") int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        return "calculateSum"; 
    }

    @RequestMapping("/employeeForm")
    public String employeeForm() {
        return "employeeForm"; 
    }

    @RequestMapping("/addNumbers")
    public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        return "addNumbers"; 
    }

    @RequestMapping("/combine")
    public String combineStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        model.addAttribute("combined", str1 + " " + str2);
        return "combine"; 
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        model.addAttribute("product", num1 * num2);
        return "calculate"; 
    }
}

