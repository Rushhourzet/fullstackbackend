package at.itkolleg.fullstackserver1.controller;

import at.itkolleg.fullstackserver1.model.Citation;
import at.itkolleg.fullstackserver1.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private AuthorService authorService;
    @Autowired
    private CitationService citationService;

    @RequestMapping("/templates")
    public String viewHomePage(Model model){
        List<Citation> citationList = citationService.listAll();
        model.addAttribute("citationList", citationList);

        return "index";
    }
}
