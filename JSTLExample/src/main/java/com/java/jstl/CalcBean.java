package com.java.jstl;

public class CalcBean {

    private int firstNo;
    private int secondNo;
    private int result;

    public int getFirstNo() {
        return firstNo;
    }

    public void setFirstNo(int firstNo) {
        this.firstNo = firstNo;
    }

    public int getSecondNo() {
        return secondNo;
    }

    public void setSecondNo(int secondNo) {
        this.secondNo = secondNo;
    }

    public int getResult() {
        return result;
    }

    public int calculateSum() {
        result = firstNo + secondNo;
        return result;
    }

    public int calculateDifference() {
        result = firstNo - secondNo;
        return result;
    }

    public int calculateProduct() {
        result = firstNo * secondNo;
        return result;
    }

    public int calculateQuotient() {
        if (secondNo != 0) {
            result = firstNo / secondNo;
        } else {
            result = 0; // handle divide by zero
        }
        return result;
    }
}
