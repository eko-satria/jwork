import java.util.ArrayList;

public class DatabaseJob {
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Job> getCustomerDatabase() {
        return JOB_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Job getJobById(int id) throws JobNotFoundException{
        for(Job job : JOB_DATABASE) {
            if(job.getid() == id) {
                return job;
            }
        }
        throw new JobNotFoundException(id);
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId) {
        for(Job recruiter : JOB_DATABASE) {
            if(recruiter.getid() == recruiterId) {
                JOB_DATABASE.add(recruiter);
                return JOB_DATABASE;
            }
        }
        return null;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory jobCategory) {
        ArrayList<Job> list = new ArrayList<Job>();
        
        for(Job job : JOB_DATABASE) {
            if(job.getCategory().equals(jobCategory)) {
                list.add(job);
                //return temp;
            }
        }
        return list;
    }

    public static boolean addJob (Job job) {
        JOB_DATABASE.add(job);
        lastId = job.getid() + 1;
        
        return true;
    }

    public static boolean removeJob (int id) throws JobNotFoundException {
        for(Job job : JOB_DATABASE) {
            if (job.getid() == id) {
                JOB_DATABASE.remove(job);
                return true;
            }
        }
        throw new JobNotFoundException(id);
    }


  
}
