package ua.itea.bootformeat.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@RequestMapping
public interface CartController {

    @PostMapping(value = "/cart")
    ResponseEntity<Map<String, Integer>> cart(@RequestParam(name = "quantity") String quantity,
                                                             @RequestParam(name = "id") String id,
                                                             @RequestParam(name = "operation") String operation);
}
