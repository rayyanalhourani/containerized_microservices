package com.AnalyticsService.service;

import com.AnalyticsService.model.Analytics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AnalyticsService {

    @Autowired
    AnalyticsRepository analysticsRepository;

    public void UpdateMarks(Analytics analytics) {
        analysticsRepository.deleteAll();
        analysticsRepository.save(analytics);
    }





}
