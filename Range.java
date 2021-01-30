package com.nihilo;

public class Range {

    private double low;
    private double high;

    public Range(double low, double high) {
        this.low = low;
        this.high = high;
    }

 public Boolean contains(double input){
        if(input>=low&&input<=high){
            return true;
        }
        return false;
 }




}
