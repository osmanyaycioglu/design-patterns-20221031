package org.design.patterns.training.behavioral.interpreter;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Interpreter implements IInterpret {
    private Map<String, IInterpret> interpretMap = new ConcurrentHashMap<>();

    public Interpreter(List<IInterpret> iInterprets) {
        iInterprets.forEach(i -> interpretMap.put(i.command(),
                                                  i));
    }

    @Override
    public void interpret(String str) {
        String[] s = str.split(" ");
        IInterpret iInterpret = interpretMap.get(s[0]);
        if (iInterpret != null) {
            if (s[0].length() + 1 >= str.length()){
                iInterpret.interpret("");
            } else {
                iInterpret.interpret(str.substring(s[0].length() + 1,
                                                   str.length()));
            }
        } else {
            System.out.println("böyle bir komut yok");
        }
    }

    @Override
    public String command() {
        return null;
    }
}
