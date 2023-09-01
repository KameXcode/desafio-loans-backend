package com.example.desafiobackemprestimo.services;
import com.example.desafiobackemprestimo.dtos.LoanDTO;
import com.example.desafiobackemprestimo.entities.CustomerEntity;
import com.example.desafiobackemprestimo.dtos.LoanDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CustomerLoansService{

    @Autowired
    private CustomerEntity customer;
    public static List<LoanDTO> loansService(CustomerEntity customer) {
        System.out.println(customer);
        List<LoanDTO> emprestimosElegiveis = new ArrayList<LoanDTO>();
        double income = customer.getIncome();
        int age = customer.getAge();
        String location = customer.getLocation();

        // Conceder o empréstimo pessoal se o income do cliente for igual ou inferior a R$ 3000.
        if (income <= 3000) {
            emprestimosElegiveis.add(new LoanDTO("PERSONAL", 4));
        }

        // Conceder o empréstimo pessoal se o income do cliente estiver entre R$ 3000 e R$ 5000,
        // ou se o cliente tiver menos de 30 anos e residir em São Paulo (SP).
        if (income > 3000 && income <= 5000 || age < 30 && location.equals("sp")) {
            emprestimosElegiveis.add(new LoanDTO("PERSONAL", 4));
        }

        // Conceder o empréstimo consignado se o income do cliente for igual ou superior a R$ 5000.
        if (income >= 5000) {
            emprestimosElegiveis.add(new LoanDTO("CONSIGNMENT", 2));
        }

        // Conceder o empréstimo com garantia nas condições especificadas.
        if ((income <= 3000) || (income > 3000 && income <= 5000 || age < 30 && location.equals("sp"))) {
            emprestimosElegiveis.add(new LoanDTO("GUARANTEED", 3));
        }





        System.out.println(emprestimosElegiveis);
        return emprestimosElegiveis;
    }
}
