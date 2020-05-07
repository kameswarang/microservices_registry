package kganesh1795.microservices_registry.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@RestController
@CrossOrigin(origins={"${UBBL_QUERY_SERVICE}"}, methods={RequestMethod.GET})
@RequestMapping("/start")
public class IndexRestController {
    @GetMapping
    public String get() {
        return "start";
    }
}