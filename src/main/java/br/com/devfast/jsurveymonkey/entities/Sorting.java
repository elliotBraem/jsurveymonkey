package br.com.devfast.jsurveymonkey.entities;

import br.com.devfast.jsurveymonkey.enums.SortingType;

public class Sorting {

    SortingType type;
    boolean ignore_last;

    public Sorting() {

    }

    public SortingType getType() {
        return type;
    }

    public void setType(SortingType type) {
        this.type = type;
    }

    public boolean isIgnore_last() {
        return ignore_last;
    }

    public void setIgnore_last(boolean ignore_last) {
        this.ignore_last = ignore_last;
    }
}