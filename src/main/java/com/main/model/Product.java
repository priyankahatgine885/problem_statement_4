package com.main.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Product {
    private String productName;
    private String libraryName;
    private  String version;
    @Override
    public String toString() {
        return String.format("%s: %s: %s", productName, libraryName, version);
    }
}