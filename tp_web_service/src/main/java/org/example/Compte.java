package org.example;

import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
    private int code;
    private double solde;
    private Date date_creation ;

    public Compte() {}


    public Compte( int code,double solde ,Date date_creation) {
        this.solde = solde;
        this.code = code;
        this.date_creation = date_creation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }
}
