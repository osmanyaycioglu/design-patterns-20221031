package org.design.patterns.training.structural.bridge.car.composite;

import java.util.ArrayList;

public class MyDir extends MyFile {

    public MyDir(String name) {
        super(name,
              0);
    }

    @Override
    public MyDir addSubFile(MyFile myFile) {
        if (subFiles == null){
            subFiles = new ArrayList<>();
        }
        subFiles.add(myFile);
        return this;
    }


}
