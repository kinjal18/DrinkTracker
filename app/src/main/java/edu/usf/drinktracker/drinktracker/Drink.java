package edu.usf.drinktracker.drinktracker;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Drink implements Serializable {

    public double Volume;
    public Date DateTime;
    public String DrinkType;
    public int Quantity;

    public Drink() {
    }

    public Drink(String drinkType, double volume, int quantity, Date dateTime) {
        this.Volume = volume;
        this.DateTime = dateTime;
        this.DrinkType = drinkType;
        this.Quantity = quantity;
    }

}
