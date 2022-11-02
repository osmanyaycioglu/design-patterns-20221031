package org.design.patterns.training.atm;

public enum EAccountType {
    TL("Turk lirası"),
    USD("Amerikan doları"),
    EURO("Euro");

    private String accountDesc;

    EAccountType(String accountDesc) {

        this.accountDesc = accountDesc;
    }

    public String getAccountDesc() {
        return accountDesc;
    }

}
