package com.idi.gameofthrones.ironbank.dao;

import com.idi.gameofthrones.ironbank.model.Bank;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface BankDao extends PagingAndSortingRepository<Bank,Integer> {

    List<Bank> findByBalanceGreaterThan(int amount);

    @EventListener(ContextRefreshedEvent.class)
    default void fillBank(){
        Bank bank = new Bank();
        bank.setBalance(500);
        save(bank);
    }













}
