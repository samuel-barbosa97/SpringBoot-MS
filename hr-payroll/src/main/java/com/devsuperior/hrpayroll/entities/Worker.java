package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;

public class Worker implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Double dailyIncome;

    public Worker() {

    }

    public Worker(Long id, String name, Double dailyIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (id != null ? !id.equals(worker.id) : worker.id != null) return false;
        if (name != null ? !name.equals(worker.name) : worker.name != null) return false;
        return dailyIncome != null ? dailyIncome.equals(worker.dailyIncome) : worker.dailyIncome == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dailyIncome != null ? dailyIncome.hashCode() : 0);
        return result;
    }
}
