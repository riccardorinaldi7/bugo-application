package it.whiskstudio.bugo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Random;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    String appName;

    @Resource
    Random rand;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("appName", appName);
        return "home";
    }

    @GetMapping("/creapartita")
    public String creaPartita(Model model){

        model.addAttribute("idPartita", rand.nextInt());
        return "creapartita";
    }

    @GetMapping("/trovapartita")
    public String cercaPartita(Model model, @RequestParam String idpartita){
        model.addAttribute("idPartita", idpartita);
        return "trovapartita";
    }

}
