package com.ShowResultsApp.service;

import com.ShowResultsApp.model.Analytics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnalyticsService {

    @Autowired
    AnalyticsRepository analyticsRepository;

    public Analytics getAnalytics () {

        if(analyticsRepository.findAll().isEmpty()){
            return new Analytics(0,0,0,0,0);
        }
        return analyticsRepository.findAll().get(0);
    }





}
