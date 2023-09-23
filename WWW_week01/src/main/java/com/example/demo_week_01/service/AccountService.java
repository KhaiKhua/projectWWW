package com.example.demo_week_01.service;

import com.example.demo_week_01.enums.AccountStatus;
import com.example.demo_week_01.models.Account;

import com.example.demo_week_01.resource.AcountRepository;

import jakarta.inject.Inject;

import java.util.List;

public class AccountService {
    @Inject
    private AcountRepository repository;




    public List<Account> getAll() {
        return repository.getlisstAccount();
    }


    public Account findById(String id) {
        return repository.find(id);
    }

    public boolean create(Account a) {
        return repository.CreateAccount(a);
    }


    public boolean update(Account a) {
        return repository.Update(a);
    }


    public void delete(String userName) {
        Account a = repository.find(userName);
        a.setStatus(AccountStatus.DELETE) ;
    }

    public List<Account> dAccByRole() {

        return repository.findAccByOneRole();
    }


    public Account findRole(String username) {
        return repository.findAccByName(username);
    }
}
