package com.idi.gameofthrones.ironbank.services;

import com.idi.gameofthrones.ironbankstarter.ConditionalOnProduction;
import com.idi.gameofthrones.ironbankstarter.NotEnoughMoneyException;
import com.idi.gameofthrones.ironbank.dao.BankDao;
import com.idi.gameofthrones.ironbank.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Evgeny Borisov
 */
@Service
@Transactional
public class BankService {
    @Autowired
    private BankDao bankDao;
    @Autowired
    private PredictionService predictionService;


    public String loan(String name, int amount) {
        Bank bank = bankDao.findAll().iterator().next();
        if (bank.getBalance() < amount) {
            throw new NotEnoughMoneyException("אין כסף");
        }
        if (predictionService.willSurvive(name)) {
            bank.setBalance(bank.getBalance() - amount);
            return "loan was accepted";
        } else {
            return "loan declined, you will die soon";
        }
    }


}
