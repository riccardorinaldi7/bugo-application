package it.whiskstudio.bugo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("appName", appName);
        return "home";
    }

    @GetMapping("/creapartita")
    public String creaPartita(Model model){
        Random rand = new Random(0);
        int n1 = rand.nextInt(10);
        int n2 = rand.nextInt(10);
        int n3 = rand.nextInt(10);
        String c4 = getCharForNumber(rand.nextInt(27));
        String c5 = getCharForNumber(rand.nextInt(27));
        String idPartita = "" + n1 + n2 + n3 + c4 + c5;
        model.addAttribute("idPartita", idPartita);
        return "creapartita";
    }

    @GetMapping("/cercapartita")
    public String cercaPartita(Model model, @RequestParam String idpartita){
        model.addAttribute("idPartita", idpartita);
        return "cercapartita";
    }

    private String getCharForNumber(int i) {
        return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
    }
}
