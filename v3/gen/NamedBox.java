package ru.ivt5.v3.gen;

import ru.ivt5.v3.Figure;

public class NamedBox<T extends Figure> extends Box{
    private String name;

    public NamedBox(T obj, String str) {
        super(obj);
        this.name = str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
