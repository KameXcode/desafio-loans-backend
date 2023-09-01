package com.example.desafiobackemprestimo.entities;

import com.example.desafiobackemprestimo.dtos.LoanDTO;

import java.util.List;

public class CustomerLoanResponse {
    private String customer;
    private List<LoanDTO> loans;



    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<LoanDTO> getLoans() {
        return loans;
    }

    public void setLoans(List<LoanDTO> loans) {
        this.loans = loans;
    }
}
