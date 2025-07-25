package com.codesign.myServiceBook.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Users {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
