package com.nikhil.learning.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class GroupExpense extends BaseModel{

    @ManyToOne
    private Group group;

    @ManyToOne
    private Expense expense;
}
