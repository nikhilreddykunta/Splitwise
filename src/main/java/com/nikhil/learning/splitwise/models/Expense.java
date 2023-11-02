package com.nikhil.learning.splitwise.models;

import com.nikhil.learning.splitwise.enums.ExpenseStatus;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Expense extends BaseModel{
    private String description;
    private Double amount;

    @ManyToOne
    private User createdby;

    @ManyToMany
    private List<User> users = new ArrayList<>();

    @OneToMany(mappedBy = "expense")
    private List<UserExpense> paidBy = new ArrayList<>();

    @OneToMany(mappedBy = "expense")
    private List<UserExpense> owedBy = new ArrayList<>();

    @Enumerated
    private ExpenseStatus expenseStatus;
}
