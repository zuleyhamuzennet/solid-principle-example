package com.ba.solid.s.better;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Customer {
    String name;
    int age;
    long bill;
    List listsOfItems;

    Customer(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

}
