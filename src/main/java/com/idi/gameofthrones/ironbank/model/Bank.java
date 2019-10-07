package com.idi.gameofthrones.ironbank.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Evgeny Borisov
 */
@Entity
@Data
public class Bank {
    @Id
    @GeneratedValue

    private int id;
    private long balance;
}
