package com.ninjaapps.zad.zad2;

import org.springframework.stereotype.Component;

/**
 * Author: Daniel
 */
@Component
public class Library {
    public String openingHours() {
        return "08:00 - 16:00";
    }

    public boolean isOpen() {
        return true;
    }
}
