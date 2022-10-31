package org.design.patterns.training.oo;

import lombok.Getter;

@Getter
public class Harita {
    private int olcek;
    private String name;

    public static Harita createHarita(){
        return new Harita();
    }


    public Harita setOlcek(int olcek) {
        this.olcek = olcek;
        return this;
    }

    public Harita setName(String name) {
        this.name = name;
        return this;
    }
}
