/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import mx.itson.catrina.enums.TransactionType;

/**
 *
 * @author alexi
 */
public class Transaction {
    
    private String date;
    private String description;
    private double amount;
    private TransactionType type;

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the type
     */
    public TransactionType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(TransactionType type) {
        this.type = type;
    }
    
    /**
     * Remove the "-" and transform the date into an int
     * @return the date in int format
     */
    public int formatDate(){
        int formatDate = Integer.parseInt(this.date.replace("-", ""));
        return formatDate;
    }
    
    /**
     * Gets the month of the transaction
     * @return the number of the month
     */
    public int getMonth(){
        String mes = getDate().substring(5, 7);
        int month = Integer.parseInt(mes);
        return month;
    }
    
    
}
