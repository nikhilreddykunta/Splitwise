package com.nikhil.learning.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Expense extends BaseModel{
    private String description;
    private Double amount;

    @ManyToOne
    private User createdby;

    @OneToMany
    private List<UserExpense> paidBy = new ArrayList<>();

    @OneToMany
    private List<UserExpense> owedBy = new ArrayList<>();
}
