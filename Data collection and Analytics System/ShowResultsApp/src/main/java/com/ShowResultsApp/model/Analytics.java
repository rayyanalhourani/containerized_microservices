package com.ShowResultsApp.model;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collections;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Analytics")
public class Analytics {
    @Id
    private int max;
    private int min;
    private double average;
    private double median;
    private int numberOfStudents;


    public Analytics(ArrayList<Integer> marks){
        this.numberOfStudents=marks.size();
        this.min=findMin(marks);
        this.max=findMax(marks);
        this.average= findAverage(marks);
        this.median= findMedian(marks);
    }

    public int findMax(ArrayList<Integer> arrayList) {
        return Collections.max(arrayList);
    }

    public int findMin(ArrayList<Integer> arrayList) {
        return Collections.min(arrayList);
    }

    public double findAverage(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        return (double) sum / arrayList.size();
    }

    public double findMedian(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);

        if (arrayList.size() % 2 == 0) {
            int mid1 = arrayList.get(arrayList.size() / 2);
            int mid2 = arrayList.get(arrayList.size() / 2 - 1);
            return (double) (mid1 + mid2) / 2;
        } else {
            return (double) arrayList.get(arrayList.size() / 2);
        }
    }
}
