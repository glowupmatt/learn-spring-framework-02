package com.in28minutes.learn_spring_framework.examples.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @Component
@Repository
public class MySQLDataService implements DataService {
    public int[] retrieveData() {
        // Some dummy data
        return new int[] { 1, 2, 3, 4, 5 };
    }
    
}
