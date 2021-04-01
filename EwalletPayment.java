public abstract class EwalletPayment extends Invoice {
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        super(id, job, date, jobseeker, invoiceStatus);
    }

    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, Bonus bonus, InvoiceStatus invoiceStatus){
        super(id, job, date, jobseeker, invoiceStatus);
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
    
    public void printData(){
        if(getBonus().getActive() == false || totalFee < getBonus().getMinTotalFee()){
            System.out.println("ID: " +getid() +
            "\nJob: " +getJob() +
            "\nDate: " +getDate() +
            "\nTotal Fee: " +getTotalFee()+
            "\nJobseeker: " +getJobseeker().getName() +
            "\nPayment Type: " +getPaymentType() +
            "\nStatus: " +getInvoiceStatus());
        }
        else{
            System.out.println("ID: " +getid() +
            "\nJob: " +getJob() +
            "\nDate: " +getDate() +
            "\nTotal Fee: " +getTotalFee()+
            "\nJobseeker: " +getJobseeker().getName() +
            "\nPayment Type: " +getPaymentType() +
            "\nStatus: " +getInvoiceStatus()+
            "\nReferral Code : " + getBonus().getRefferalCode());
        }
}
    }
