import java.util.ArrayList;
import java.util.Calendar; 
import java.util.GregorianCalendar;
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Invoice
{
    private int id;
    private ArrayList<Job> job;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

    public Invoice(int id, ArrayList<Job> job, Jobseeker jobseeker)
    {
        this.id = id;
        this.job = new ArrayList<Job>();
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus;
    }

    public int getid(){
        return id;
    }

    public ArrayList<Job> getJob () {
        return job;
    }

    public Calendar getDate(){
        return date;
    }
    
    public int getTotalFee(){
        return totalFee;
    }

    public Jobseeker getJobseeker(){
        return jobseeker;
    }

    public abstract PaymentType getPaymentType();

    public InvoiceStatus getInvoiceStatus(){
        return invoiceStatus;
    }

    public void setid(int id){
        this.id = id;
    }

    public void setidJobs(ArrayList<Job> job){
        this.job = job;
    }

    public void setDate(Calendar date){
        this.date = new GregorianCalendar();
    }

    public Calendar setDate(int year, int month, int dayOfMonth){
        return date ;
    }

    public abstract void setTotalFee();

    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }

    public void setPaymentType(){;
    }

    public void setInvoiceStatus(InvoiceStatus invoiceStatus){
        this.invoiceStatus = invoiceStatus;
    }
    public String toString(){
        return "";
    };

}
