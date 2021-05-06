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

    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException {
        for(Recruiter recruiter : RECRUITER_DATABASE) {
            if(recruiter.getId() == id) {
                return recruiter;
            }
        }
        throw new RecruiterNotFoundException(id);
    }

    public static boolean addRecruiter(Recruiter recruiter) {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId() + 1;
        
        return true;
    }

    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException {
        for(Recruiter recruiter : RECRUITER_DATABASE) {
            if(recruiter.getId() == id) {
                RECRUITER_DATABASE.remove(recruiter);
                return true;
            }
        }
        throw new RecruiterNotFoundException(id);
    }
}
