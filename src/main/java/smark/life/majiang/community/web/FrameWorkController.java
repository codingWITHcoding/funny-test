package smark.life.majiang.community.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/framework")
public class FrameWorkController {
    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("name","hahaha");
        return "login";
    }
}
