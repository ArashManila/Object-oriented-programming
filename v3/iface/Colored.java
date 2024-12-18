package ru.ivt5.v3.iface;

import ru.ivt5.v3.colors.Color;
import ru.ivt5.v3.colors.ColorException;

public interface Colored {
    void setColor(Color color) throws ColorException;
    Color getColor();
}
