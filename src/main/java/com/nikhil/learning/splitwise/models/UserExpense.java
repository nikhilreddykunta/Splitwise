package com.nikhil.learning.splitwise.models;

import com.nikhil.learning.splitwise.enums.ExpenseType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Getter
@Entity
public class UserExpense extends BaseModel{

    @ManyToOne
    private User user;
    @ManyToOne
    @JoinColumn(name = "expense_id")
    private Expense expense;
    private Double amount;

    @Enumerated
    private ExpenseType expenseType;
}
