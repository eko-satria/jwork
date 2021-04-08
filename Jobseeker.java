import java.util.Calendar; 
import java.util.Date; 
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat; 
import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class Jobseeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;

    public Jobseeker(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = Calendar.getInstance();
    }

    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    public Jobseeker(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getid(){
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public Calendar getJoinDate()
    {
        return joinDate;
    }

    public void setid(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email)
    {
        String pattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if(m.find())
        {
            this.email = email; //assign email ke email instance
        }
        else
        {
            this.email = "null"; //assign email ke email instance
        }
    }

    public void setPassword(String password)
    {
        String pattern = "(?=.*[a-z])(?=.*d)(?=.*[A-Z]).{6,}";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if(m.find())
        {
            this.password = password;
        }
        else
        {
            this.password = "null"; //assign email ke email instance
        }
        
    }

    public void setJoinDate (Calendar joinDate) {
        this.joinDate = joinDate;
    }

    public void setJoinDate(int year, int month, int dayOfMonth) {
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    /**public void printData(){
        System.out.println("ID: " + getid());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Password: " + getPassword());
        System.out.println("Join Date: " + getJoinDate());
    **/

    public String toString(){
        String string = ""; 
        if (joinDate!=null)
        {
            Date date = joinDate.getTime(); 
            SimpleDateFormat format1 = new SimpleDateFormat ("dd-MM-yyyy"); 
            String date1 = format1.format(date); 
            string =  
                    "===================Jobseeker================"+"\n"+
                    "Id : "+ id+ "\n"+
                    "Name : "+ name+ "\n"+
                    "Email : "+ email+ "\n"+
                    "Password : "+ password+ "\n"+
                    "Join Date : "+ date1+"\n"; 
                }
         else{
             string =  
                    "===================Jobseeker================"+"\n"+
                    "Id : "+ id+ "\n"+
                    "Name : "+ name+ "\n"+
                    "Email : "+ email+ "\n"+
                    "Password : "+ password+ "\n";
                    //"Join Date : "+ joinDate+ "\n"; 
            }
            
        System.out.println(string); 
        return string; 
    }
}
