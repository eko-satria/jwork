
/**
 * Write a description of class JWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JWork
{
    public static void main(String[] args) {
        Jobseeker jobseeker1 = new Jobseeker(1, "shinta", "shinta767", "password", "05-01-2021");
        Location location1 = new Location("Jakarta", "Jakarta", "Ibu kota");
        Recruiter recruiter1 = new Recruiter(1, "eko", "ekosatria@ui.ac.id", "0888888", location1);
        Job job1 = new Job(1, "Senior Designer", 10000000, JobCategory.FrontEnd, recruiter1);
        Job job2 = new Job(2, "Senior Designer", 15000000, JobCategory.UI, recruiter1);
        Bonus bonus1 = new Bonus(1, "ref 1", 100000, 12000000, true);
        EwalletPayment wEwalletPayment = new EW
}
