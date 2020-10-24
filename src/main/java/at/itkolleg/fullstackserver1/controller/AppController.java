package at.itkolleg.fullstackserver1.controller;

import at.itkolleg.fullstackserver1.service.AuthorService;
import at.itkolleg.fullstackserver1.service.CitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {
    @Autowired
    private AuthorService authorService;
    @Autowired
    private CitationService citationService;
}
