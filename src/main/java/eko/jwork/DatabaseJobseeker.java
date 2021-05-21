package eko.jwork;
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

    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if(jobseeker.getid() == id) {
                return jobseeker;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }

    public static boolean registerJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {

        if(jobseeker.getEmail().equals(jobseeker.getEmail())){
            throw new EmailAlreadyExistsException(jobseeker);
        }
        else{
            JOBSEEKER_DATABASE.add(jobseeker);
            lastId = jobseeker.getid()+1;
        }
        return false;
    }

    public static boolean removeJobseeke(int id) throws JobSeekerNotFoundException {
        for(Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getid() == id) {
                JOBSEEKER_DATABASE.remove(jobseeker);
                return true;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }

    public static Jobseeker jobseekerLogin(String email, String password) throws JobSeekerNotFoundException {
        for(Jobseeker jobseeker : JOBSEEKER_DATABASE){
            while(jobseeker.getEmail().equals(jobseeker.getEmail()) && jobseeker.getPassword().equals(jobseeker.getPassword())){
                return jobseeker;
            }
        }
        throw new JobSeekerNotFoundException(lastId);
    }

}
