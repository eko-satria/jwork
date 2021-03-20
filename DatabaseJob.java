public class DatabaseJob {
    private String[] listJob;
    private Job job;

    public DatabaseJob(Job job){
        this.job = job;
    }

    public boolean addJob(Job job){
        return false;
    }

    public boolean removeJob(Job job){
        return false;
    }

    public Job getJob(){
        return job;
    }

    public String[] getListJob() {
        return listJob;
    }

}
