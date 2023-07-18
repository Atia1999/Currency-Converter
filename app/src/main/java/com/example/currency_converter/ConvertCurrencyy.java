package com.example.currency_converter;

public class ConvertCurrencyy {
    public static double usdBDT(double usdB){
        usdB=usdB*107;
        return usdB;
    }
    public static double bdtUSD(double bdtU){
        bdtU=bdtU/107;
        return bdtU;
    }
    public static double inrUSD(double inrU){
        inrU=inrU/82;
        return inrU;
    }
}