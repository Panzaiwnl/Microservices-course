package com.devsuperior.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    @Id
    private static final long serivalVersionUID = 1L;
    private String name;
    private Double dailyincome;
    private Integer days;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyincome() {
        return dailyincome;
    }

    public void setDailyincome(Double dailyincome) {
        this.dailyincome = dailyincome;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public double getTotal(){
        return days * dailyincome;
    }
}
