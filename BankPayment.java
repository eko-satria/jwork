public class BankPayment extends Invoice{
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    int adminFee;

    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        super(id, job, jobseeker, invoiceStatus);
    }

    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus, int adminFee){
        super(id, job, jobseeker, invoiceStatus);
        this.adminFee = adminFee;
    }

    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }

    public int getAdminFee(){
        return adminFee;
    }

    public void SetAdminFee(int adminFee){
        this.adminFee = adminFee;
    }

    public void setTotalFee(){
        if(adminFee == 0){
            totalFee = super.getJob().getFee() - adminFee;
        }

        else{
            totalFee = super.getJob().getFee();
        }
    }

    public String toString(){
        if(adminFee == 0){
            return "++++++++++++++++++++++++++++++++++++"+
            "\nID: " +getid()+
            "\nJob: " +getJob().getName()+
            "\nDate: " +getDate() +
            "\nJobseeker: " +getJobseeker().getName()+
            "\nAdminFee: " +getAdminFee()+
            "\nTotal Fee: " +getTotalFee()+
            "\nInvoice Status: " + getInvoiceStatus()+
            "\n++++++++++++++++++++++++++++++++++++";
        }else{
            return "++++++++++++++++++++++++++++++++++++"+
            "\nID: " +getid()+
            "\nJob: " +getJob().getName()+
            "\nDate: " +getDate() +
            "\nJobseeker: " +getJobseeker().getName()+
            "\nAdminFee: " +getAdminFee()+
            "\nTotal Fee: " +getTotalFee()+
            "\nInvoice Status: " + getInvoiceStatus()+
            "\n++++++++++++++++++++++++++++++++++++";
        }
    }
    /*public void printData(){
        if(adminFee == 0){
            System.out.println("++++++++++++++++++++++++++++++++++++"+
            "\nID: " +getid()+
            "\nJob: " +getJob().getName()+
            "\nDate: " +getDate() +
            "\nJobseeker: " +getJobseeker().getName()+
            "\nAdminFee: " +getAdminFee()+
            "\nTotal Fee: " +getTotalFee()+
            "\nInvoice Status: " + getInvoiceStatus()+
            "\n++++++++++++++++++++++++++++++++++++");
        }

        else{
            System.out.println("++++++++++++++++++++++++++++++++++++"+
            "\nID: " +getid()+
            "\nJob: " +getJob().getName()+
            "\nDate: " +getDate() +
            "\nJobseeker: " +getJobseeker().getName()+
            "\nAdminFee: " +getAdminFee()+
            "\nTotal Fee: " +getTotalFee()+
            "\nInvoice Status: " + getInvoiceStatus()+
            "\n++++++++++++++++++++++++++++++++++++");
        }
    }*/
