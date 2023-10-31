package com.nikhil.learning.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class User extends BaseModel{
    private String name;
    private String phoneNumber;
    private String password;
}
