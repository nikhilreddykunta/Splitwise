package com.nikhil.learning.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Group extends BaseModel{
    private String name;

    @ManyToOne
    private User createdBy;

    @ManyToMany
    private List<User> members = new ArrayList<>();

    @ManyToMany
    private List<User> admins = new ArrayList<>();

}
