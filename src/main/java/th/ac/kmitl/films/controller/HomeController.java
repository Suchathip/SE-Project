package th.ac.kmitl.films.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String getHomePage(Model model) {
        model.addAttribute("title", "Sawaddee");
        // return home.html
        return "home";
    }

}
