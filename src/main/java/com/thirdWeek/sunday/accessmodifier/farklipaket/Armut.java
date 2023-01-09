package com.thirdWeek.sunday.accessmodifier.farklipaket;

public class Armut {
    protected String strValue;

    public void test() {
        Muz muz = new Muz();
        int iValue = muz.iValue;
    }

    class Muz {
        int iValue;

        public void main() {
            String strValue = Armut.this.strValue;
        }
    }

}
