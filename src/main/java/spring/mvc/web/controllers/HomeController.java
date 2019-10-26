package spring.mvc.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController
{
    @GetMapping("/hello")
    @ResponseBody
    public String sayHello()
    {
        return "elo bolo elo gizmo";
    }
}
