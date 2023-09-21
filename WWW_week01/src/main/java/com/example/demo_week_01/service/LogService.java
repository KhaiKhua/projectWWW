package com.example.demo_week_01.service;


import com.example.demo_week_01.models.Log;
import com.example.demo_week_01.resource.Logrepository;
import jakarta.inject.Inject;

import java.util.List;

public class LogService {
    @Inject
    private Logrepository repository;

    public boolean createLog(Log log) {
        return repository.CreatLog(log);
    }


    public List<Log> find(String u) {
        return repository.findLog(u);
    }
}
