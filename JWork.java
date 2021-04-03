
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
        Job job1 = new Job(1, "Senior Designer", 100, JobCategory.FrontEnd, recruiter1);
        Job job2 = new Job(2, "Senior Designer", 500, JobCategory.UI, recruiter1);
        Bonus bonus1 = new Bonus(1, "ref 1", 100000, 200, true);
        BankPayment payment1 = new BankPayment(1, job1, "03-03-2021", jobseeker1, InvoiceStatus.FINISHED);
        BankPayment payment2 = new BankPayment(2, job1,"05-03-2021", jobseeker1, InvoiceStatus.ONGOING);
        BankPayment payment3 = new BankPayment(3, job2, "06-03-2021", jobseeker1, InvoiceStatus.ONGOING, 200);
        
        payment1.setTotalFee();
        payment1.printData();

        payment2.setTotalFee();
        payment2.printData();

        payment3.setTotalFee();
        payment3.printData();
        }
    }
