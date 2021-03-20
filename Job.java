/**
 * Write a description of class Job here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Job
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int fee;
    private String category;
    private Recruiter recruiter;

    public Job(int id, String name, int fee, String category, Recruiter recruiter)
    {
        this.id = id;
        this.name = name;
        this.fee = fee;
        this.category = category;
        this.recruiter = recruiter;
    }

    public int getid(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getFee(){
        return fee;
    }

    public String getCategory(){
        return category;
    }

    public Recruiter getRecruiter(){
        return recruiter;
    }

    public void setId(int id){
        this.id = id;
    }   

    public void setName(String name){
        this.name = name;
    }

    public void setRecruiter(Recruiter recruiter){
        this.recruiter = recruiter;
    }

    public void setFee(int fee){
        this.fee = fee;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void printData(){
        System.out.println("ID: "+getid());
        System.out.println("Name"+getName());
        System.out.println("Fee"+getFee());
        System.out.println("Category"+getCategory());
        System.out.println("Recruiter"+getRecruiter());
    };
}
