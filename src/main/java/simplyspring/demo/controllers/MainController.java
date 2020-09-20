package simplyspring.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

@Controller
public class MainController {


    @GetMapping("/")
    public String home(Map<String, Object> model) {
        model.put("name", "World");
        return "home";
    }

    @GetMapping("/uslugi")
    public String about(Map<String, Object> model) {
        model.put("title", "Посмотреть услуги");
        return "uslugi";
    }



}
