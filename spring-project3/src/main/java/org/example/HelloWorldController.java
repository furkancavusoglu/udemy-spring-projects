package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processForm2")
    public String toUpper(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        String result = "Selam! " + name.toUpperCase();

        model.addAttribute("message", result);
        return "helloworld";
    }

    @RequestMapping("/processForm3")
    public String toUpper2(@RequestParam("studentName") String name, Model model) {
        String result = "Merhaba from processForm3! " + name.toUpperCase();

        model.addAttribute("message", result);
        return "helloworld";
    }
}
