package com.company;

public class Range {

    private int low;
    private int high;

    public Range(int low, int high) {
        this.low = low;
        this.high = high;

    }


    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public boolean isInRange(int num){
        return num >= low && num <= high;
    }

    public boolean isInRange(int num,int num2){
        return num >= low && num2 <= high;
    }


    public boolean contains(double average) {
        return false;
    }
}
