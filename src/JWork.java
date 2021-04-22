import java.util.GregorianCalendar;

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
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId()+1, "Marinus Martin", "martinf95@gmail.gov", "08227617829", location));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId(), "Eko Satria", "eko.satria@ui.ac.id", "qwerty19OK"));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId(), "Eko Satria", "eko.satria@ui.ac.id", "WASD9090yeah"));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId(), "Ilmi", "fathur@gmail.com", "AAAAAyeah10"));

        System.out.println(DatabaseCustomer.getCustomerDatabase());

        Job job1 = new Job(1, "Job1", 10000, JobCategory.DataScientist, DatabaseRecruiter.getRecruiterById(0));
        Job job2 = new Job(1, "Job2", 12000, JobCategory.BackEnd, DatabaseRecruiter.getRecruiterById(0));
        Job job3 = new Job(1, "Job2", 15000, JobCategory.BackEnd, DatabaseRecruiter.getRecruiterById(0));

        System.out.println(DatabaseJob.getJobByCategory(JobCategory.BackEnd));
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.DataScientist));
        }
    
}
