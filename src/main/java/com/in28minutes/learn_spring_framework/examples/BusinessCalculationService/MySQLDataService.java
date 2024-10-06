package com.in28minutes.learn_spring_framework.examples.BusinessCalculationService;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {
    public int[] retrieveData() {
        // Some dummy data
        return new int[] { 1, 2, 3, 4, 5 };
    }
    
}
