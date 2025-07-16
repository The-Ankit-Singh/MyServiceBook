package com.codesign.myServiceBook.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Documents {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Documents{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
