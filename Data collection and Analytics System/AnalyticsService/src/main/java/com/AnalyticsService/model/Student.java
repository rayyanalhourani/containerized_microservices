package com.AnalyticsService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int mark;
}
