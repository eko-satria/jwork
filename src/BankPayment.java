import java.util.ArrayList;

public class BankPayment extends Invoice{
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    int adminFee;

    public BankPayment(int id, ArrayList<Job> job, String date, Jobseeker jobseeker){
        super(id, job, jobseeker);
    }

    public BankPayment(int id, ArrayList<Job> job, String date, Jobseeker jobseeker, int adminFee){
        super(id, job, jobseeker);
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
        getJob().forEach((jobFee) -> {
            if (adminFee == 0) {
                totalFee = jobFee.getFee() - adminFee;
            } else {
                totalFee = foodPrice.getPrice();
            }
        });

        /*if(adminFee == 0){
            totalFee = super.getJob().getFee() - adminFee;
        }

        else{
            totalFee = jobseeker.getFee;
        }*/
    }

    public String toString(){
        if(adminFee == 0){
            return "++++++++++++++++++++++++++++++++++++"+
            "\nID: " +getid()+
            "\nJob: " +getJob().getName()+
            "\nDate: " +getDate().getTime() +
            "\nJobseeker: " +getJobseeker().getName()+
            "\nAdminFee: " +getAdminFee()+
            "\nTotal Fee: " +getTotalFee()+
            "\nInvoice Status: " + getInvoiceStatus()+
            "\n++++++++++++++++++++++++++++++++++++";
        }else{
            return "++++++++++++++++++++++++++++++++++++"+
            "\nID: " +getid()+
            "\nJob: " +getJob().getName()+
            "\nDate: " +getDate().getTime() +
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
