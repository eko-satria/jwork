
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

    public Invoice(int id, int idJobs, String date, int totalFee, Jobseeker jobseeker)
    {
        this.id = id;
        this.idJobs = idJobs;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
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

    public void printData(){};

}
