package com.example.desafiobackemprestimo.dtos;

public class LoanDTO {
    private String type;
    private int interest_rate;

    public LoanDTO(String type, int interest_rate) {
        this.type = type;
        this.interest_rate = interest_rate;
    }


    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(int interest_rate) {
        this.interest_rate = interest_rate;

    }
}