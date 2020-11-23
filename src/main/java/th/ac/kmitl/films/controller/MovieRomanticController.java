package th.ac.kmitl.films.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ControllerAdvice
public class MovieRomanticController {

    @RequestMapping(value = "/Romantic", method = RequestMethod.GET)
    public String getRomantic(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("var1", "var1");
        model.addAttribute("msg", "Welcome");
        return "Romantic";
    }

    @RequestMapping(value = "/Romantic2", method = RequestMethod.GET)
    public String getRomantic2(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("var1", "var1");
        model.addAttribute("msg", "Welcome");
        return "Romantic2";
    }

}
