

public class Jobseeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String joinDate;
    private String password;

    public Jobseeker(int id, String name, String email, String password, String JoinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.joinDate = joinDate;
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

    public String getJoinDate()
    {
        return joinDate;
    }

    public void setid(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setJoinDate(String joinDate){
        this.joinDate = joinDate;
    }

    public String toString(){
        return name;
    }
}
