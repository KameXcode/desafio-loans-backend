package com.example.desafiobackemprestimo.controllers;

import com.example.desafiobackemprestimo.dtos.CustomerDTO;
import com.example.desafiobackemprestimo.entities.CustomerEntity;
import com.example.desafiobackemprestimo.entities.CustomerLoanResponse;
import com.example.desafiobackemprestimo.services.CustomerLoansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/customer-loans")
public class CustomerLoansController {

    @Autowired
    private CustomerLoansService customerLoansService;

    @PostMapping
    public ResponseEntity<CustomerLoanResponse> loansCheck(@RequestBody CustomerEntity customer){
        CustomerLoanResponse response = new CustomerLoanResponse();
        response.setCustomer(customer.getName());
        response.setLoans(CustomerLoansService.loansService(customer));
        return ResponseEntity.ok(response);

    }
}
