
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    private int id;
    private int idJobs;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;
    private PaymentType paymentType;
    private InvoiceStatus status;

    public Invoice(int id, int idJobs, String date, int totalFee, Jobseeker jobseeker, PaymentType paymentType, InvoiceStatus status)
    {
        this.id = id;
        this.idJobs = idJobs;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.status = status;
    }

    public int getid(){
        return id;
    }

    public int getidJobs(){
        return idJobs;
    }

    public String getDate(){
        return date;
    }
    
    public int getTotalFee(){
        return totalFee;
    }

    public Jobseeker getJobseeker(){
        return jobseeker;
    }

    public PaymentType getPaymentType(){
        return paymentType;
    }

    public InvoiceStatus getInvoiceStatus(){
        return status;
    }

    public void setid(int id){
        this.id = id;
    }

    public void setidJobs(int idJobs){
        this.idJobs = idJobs;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setTotalFee(int  totalfee){
        this.totalFee = totalfee;
    }

    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }

    public void setPaymentType(PaymentType paymentType){
        this.paymentType = paymentType;
    }

    public void setInvoiceStatus(InvoiceStatus status){
        this.status = status;
    }
    public void printData(){
        System.out.println("ID: " +getid());
        System.out.println("IDjobs: " +getidJobs());
        System.out.println("Date: " +getDate());
        System.out.println("Total Fee: " +getTotalFee());
        System.out.println("Jobseeker: " +getJobseeker().getName());
        System.out.println("Status: " +getInvoiceStatus());
        
    }

}
