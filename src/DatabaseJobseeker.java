public class DatabaseJobseeker {
    private static String[] listJobseeker;
    private static Jobseeker jobseeker;

    public DatabaseJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }

    public static boolean addJobseeker(Jobseeker jobseeker){
        return false;
    }

    public static boolean removeJobseeker(Jobseeker jobseeker){
        return false;
    }
    
    public static Jobseeker getJobseeker(){
        return jobseeker;
    }

    public static String[] getListjobseeker(){
        return listJobseeker;
    }
}
