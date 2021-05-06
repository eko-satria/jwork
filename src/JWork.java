import java.util.GregorianCalendar;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.regex.*;


/**
 * Write a description of class JWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JWork
{
    public static void main(String[] args) {
        Location location = new Location("Depok", "Jawa Barat", "Tempat Makan nomor 1 se-Depok");
        
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId()+1, "Fatih", "fatitr@gmail.com", "0888888888", location));

        try {
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "teset 33", 10000, JobCategory.DataAnalyst, DatabaseRecruiter.getRecruiterById(1)));
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }
        

        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId()+1, "Marinus Martin", "martinf95@gmail.gov", "password"));
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId()+1, "Martina", "martinf95@gmail.gov", "password"));
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId()+1, "Bayu Satria Martin", "bayubayu@gmail.gov", "password"));
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId()+1, "Fajar Milleano", "fajarmilleano21@gmail.com", "password"));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId()+1, "Bonus 1", 1000, 10000, true));
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId()+1, "Bonus 1", 1000, 10000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseJobseeker.getJobseekerById(4);
            
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseBonus.removeBonus(3);
        } catch (BonusNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseRecruiter.removeRecruiter(4);
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseJob.removeJob(5);
        } catch (JobNotFoundException e) {
           System.out.println(e.getMessage());
        }

        }
    
}
