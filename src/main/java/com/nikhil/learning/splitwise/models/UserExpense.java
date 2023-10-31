package com.nikhil.learning.splitwise.models;

import com.nikhil.learning.splitwise.enums.expenseType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Getter
@Entity
public class UserExpense extends BaseModel{

    @ManyToOne
    private User user;
    private Double amount;

    @Enumerated
    private expenseType expenseType;
}
