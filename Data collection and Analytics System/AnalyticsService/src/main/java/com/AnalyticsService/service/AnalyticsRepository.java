package com.AnalyticsService.service;

import com.AnalyticsService.model.Analytics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyticsRepository extends MongoRepository<Analytics, Integer> {
}
