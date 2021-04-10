import java.util.Calendar; 
import java.util.Date; 
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.text.SimpleDateFormat; 
import java.time.LocalTime;
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Invoice
{
    private int id;
    private Job job;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

    public Invoice(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        this.id = id;
        this.job = job;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus;
    }

    public int getid(){
        return id;
    }

    public Job getJob(){
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

    public void setidJobs(Job job){
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
