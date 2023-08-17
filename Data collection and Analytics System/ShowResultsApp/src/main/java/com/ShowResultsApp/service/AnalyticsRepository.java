package com.ShowResultsApp.service;

import com.ShowResultsApp.model.Analytics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyticsRepository extends MongoRepository<Analytics, Integer> {
}
