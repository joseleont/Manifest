package com.example.clase3_4;

import java.io.Serializable;

public class US implements Serializable {

    private String a;
    private String b;

    public US(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
