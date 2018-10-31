package br.com.devfast.jsurveymonkey.entities;

import br.com.devfast.jsurveymonkey.enums.RequiredType;

public class Required {

    RequiredType type;
    String amount;

    public Required() {

    }

    public RequiredType getType() {
        return type;
    }

    public void setType(RequiredType type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}