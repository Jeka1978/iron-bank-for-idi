package com.idi.gameofthrones.ironbank.controllers;

import com.idi.gameofthrones.ironbank.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
public class BankController {
    @Autowired
    private BankService bankService;

    @GetMapping("/loan")
    public String loan(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return bankService.loan(name, amount);
    }
}
