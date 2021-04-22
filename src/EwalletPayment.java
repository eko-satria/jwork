import java.util.ArrayList;

public class EwalletPayment extends Invoice {
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    public EwalletPayment(int id, ArrayList<Job> job, Jobseeker jobseeker){
        super(id, job, jobseeker);
    }

    public EwalletPayment(int id, ArrayList<Job> job, Jobseeker jobseeker,Bonus bonus){
        super(id, job, jobseeker);
        this.bonus = bonus;
    }

    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }

    public Bonus getBonus(){
        return bonus;
    }

    public void setBonus(Bonus bonus){
        this.bonus = bonus;
    }

    public void setTotalFee(){
        getJob().forEach((jobFee)->{
            if(bonus != null && jobFee.getFee() >getBonus().getMinTotalFee()){
                totalFee = jobFee.getFee() + getBonus().getExtraFee();
            }
            else{
                totalFee = jobFee.getFee();
            }
        });
        
        /*if( bonus != null && getJob().getFee() > getBonus().getMinTotalFee()){
            totalFee = super.totalFee + getBonus().getExtraFee();
        }

        else{
            totalFee = super.getJob().getFee();
        }*/
    
}
    public String toString(){
        String job = " ";
        
        for(Job jobList : getJob()) {
            job = job + jobList.getName() + ", ";
        }
        job = job.substring(0, job.length() - 2);
        if(bonus == null || totalFee < getBonus().getMinTotalFee()){
            return "++++++++++++++++++++++++++++++++++++" +
            "\nID: " +getid() +
            "\nJob: " +job +
            "\nDate: " +getDate() +
            "\nJobseeker: " +getJobseeker().getName() +
            "\nPayment Type: " +getPaymentType() +
            "\nStatus: " +getInvoiceStatus()+
            "\n++++++++++++++++++++++++++++++++++++";
        }else{
            return "++++++++++++++++++++++++++++++++++++" +
            "\nID: " +getid() +
            "\nJob: " +job +
            "\nDate: " +getDate() +
            "\nTotal Fee: " +getTotalFee()+
            "\nJobseeker: " +getJobseeker().getName() +
            "\nPayment Type: " +getPaymentType() +
            "\nStatus: " +getInvoiceStatus()+
            "\nReferral Code : " + getBonus().getRefferalCode() +
            "\n++++++++++++++++++++++++++++++++++++";
        }
    }
    /*public void printData(){
        if(bonus == null || totalFee < getBonus().getMinTotalFee()){
            System.out.println("++++++++++++++++++++++++++++++++++++" +
            "\nID: " +getid() +
            "\nJob: " +getJob().getName() +
            "\nDate: " +getDate() +
            "\nJobseeker: " +getJobseeker().getName() +
            "\nPayment Type: " +getPaymentType() +
            "\nStatus: " +getInvoiceStatus()+
            "\n++++++++++++++++++++++++++++++++++++");
        }
        else{
            System.out.println("++++++++++++++++++++++++++++++++++++" +
            "\nID: " +getid() +
            "\nJob: " +getJob().getName() +
            "\nDate: " +getDate() +
            "\nTotal Fee: " +getTotalFee()+
            "\nJobseeker: " +getJobseeker().getName() +
            "\nPayment Type: " +getPaymentType() +
            "\nStatus: " +getInvoiceStatus()+
            "\nReferral Code : " + getBonus().getRefferalCode() +
            "\n++++++++++++++++++++++++++++++++++++");
        }
    }*/
}
