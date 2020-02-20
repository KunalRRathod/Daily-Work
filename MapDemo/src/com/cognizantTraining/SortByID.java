package com.cognizantTraining;

import java.util.Comparator;

public class SortByID implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        }
        else if (o1.getId() == o2.getId()) {
            return 0;
        }
        else {
            return -1;
        }

    }
}
