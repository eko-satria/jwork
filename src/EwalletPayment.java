public class EwalletPayment extends Invoice {
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    public EwalletPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        super(id, job, jobseeker, invoiceStatus);
    }

    public EwalletPayment(int id, Job job, Jobseeker jobseeker,Bonus bonus, InvoiceStatus invoiceStatus){
        super(id, job, jobseeker, invoiceStatus);
        this.bonus = bonus;
    }

    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }

    public Bonus getBonus(){
        return bonus;
    }

    public void setBonus(Bonus bonus){
        this.bonus = bonus;
    }

    public void setTotalFee(){
        if( bonus != null && getJob().getFee() > getBonus().getMinTotalFee()){
            totalFee = super.totalFee + getBonus().getExtraFee();
        }

        else{
            totalFee = super.getJob().getFee();
        }
    
}
    public String toString(){
        if(bonus == null || totalFee < getBonus().getMinTotalFee()){
            return "++++++++++++++++++++++++++++++++++++" +
            "\nID: " +getid() +
            "\nJob: " +getJob().getName() +
            "\nDate: " +getDate() +
            "\nJobseeker: " +getJobseeker().getName() +
            "\nPayment Type: " +getPaymentType() +
            "\nStatus: " +getInvoiceStatus()+
            "\n++++++++++++++++++++++++++++++++++++";
        }else{
            return "++++++++++++++++++++++++++++++++++++" +
            "\nID: " +getid() +
            "\nJob: " +getJob().getName() +
            "\nDate: " +getDate() +
            "\nTotal Fee: " +getTotalFee()+
            "\nJobseeker: " +getJobseeker().getName() +
            "\nPayment Type: " +getPaymentType() +
            "\nStatus: " +getInvoiceStatus()+
            "\nReferral Code : " + getBonus().getRefferalCode() +
            "\n++++++++++++++++++++++++++++++++++++";
        }
    }
    /*public void printData(){
        if(bonus == null || totalFee < getBonus().getMinTotalFee()){
            System.out.println("++++++++++++++++++++++++++++++++++++" +
            "\nID: " +getid() +
            "\nJob: " +getJob().getName() +
            "\nDate: " +getDate() +
            "\nJobseeker: " +getJobseeker().getName() +
            "\nPayment Type: " +getPaymentType() +
            "\nStatus: " +getInvoiceStatus()+
            "\n++++++++++++++++++++++++++++++++++++");
        }
        else{
            System.out.println("++++++++++++++++++++++++++++++++++++" +
            "\nID: " +getid() +
            "\nJob: " +getJob().getName() +
            "\nDate: " +getDate() +
            "\nTotal Fee: " +getTotalFee()+
            "\nJobseeker: " +getJobseeker().getName() +
            "\nPayment Type: " +getPaymentType() +
            "\nStatus: " +getInvoiceStatus()+
            "\nReferral Code : " + getBonus().getRefferalCode() +
            "\n++++++++++++++++++++++++++++++++++++");
        }
    }*/
}
