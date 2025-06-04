package com.JavaJunie.YogoTribeAssingment.Model;
/**
 * InputModel is the model class used to receive the input number from the client.
 */
public class InputModel {

    // This field holds the number sent by the client
    private int number;

    // Default constructor (needed for JSON deserialization)
    public InputModel() {}

    // Constructor to initialize number directly
    public InputModel(int number) {
        this.number = number;
    }

    // Getter method to access the number value
    public int getNumber() {
        return number;
    }

    // Setter method to set the number value
    public void setNumber(int number) {
        this.number = number;
    }
}