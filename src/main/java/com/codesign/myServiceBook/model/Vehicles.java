package com.codesign.myServiceBook.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vehicles {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Vehicles{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
