package eko.jwork;
public enum PaymentType{
    BankPayment("BankPayment"),
    EwalletPayment("EwalletPayment");

    String paymentType;

    PaymentType (String paymentType){
        this.paymentType = paymentType;
    }

    public String toString(){
        return paymentType;
    }
}