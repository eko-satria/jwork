import java.util.ArrayList;

public class DatabaseRecruiter {
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Recruiter> getRecruiterDatabase() {
        return RECRUITER_DATABASE;
    }
    
    public static int getLastId() {
        return lastId;
    }

    public static Recruiter getRecruiterById(int id) {
        for(Recruiter recruiter : RECRUITER_DATABASE) {
            if(recruiter.getId() == id) {
                return recruiter;
            }
        }
        return null;
    }

    public static boolean addRecruiter(Recruiter recruiter) {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId() + 1;
        
        return true;
    }

    public static boolean removeRecruiter(int id) {
        for(Recruiter recruiter : RECRUITER_DATABASE) {
            if(recruiter.getId() == id) {
                RECRUITER_DATABASE.remove(recruiter);
                return true;
            }
        }
        return false;
    }
}
