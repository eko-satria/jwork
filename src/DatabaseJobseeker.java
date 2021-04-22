import java.util.ArrayList;

public class DatabaseJobseeker {
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getJobseekerDatabase() {
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id) {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if(jobseeker.getid() == id) {
                return jobseeker;
            }
        }
        return null;
    }

    public static boolean addJobseeker(Jobseeker jobseeker) {

        if(jobseeker.getEmail().equals(jobseeker.getEmail())){
            return false;
        }
        else{
            JOBSEEKER_DATABASE.add(jobseeker);
            lastId = jobseeker.getid() + 1;
        }
        return false;
    }

    public static boolean removeJobseeke(int id) {
        for(Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getid() == id) {
                JOBSEEKER_DATABASE.remove(jobseeker);
                return true;
            }
        }
        return false;
    }
}
