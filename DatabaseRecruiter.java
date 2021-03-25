public class DatabaseRecruiter {
    private static String[] listRecruiter;
    private static Recruiter recruiter;

    public DatabaseRecruiter(Recruiter recrtuiter){
        this.recruiter = recruiter;
    }

    public static boolean addRecruiter (Recruiter recruiter){
        return false;
    }

    public static boolean removeRecruiter(Recruiter recruiter){
        return false;
    }

    public static Recruiter getRecruiter(){
        return recruiter;
    }

    public static String[] getListRecruiter(){
        return listRecruiter;
    }
}
