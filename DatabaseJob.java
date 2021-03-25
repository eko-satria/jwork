public class DatabaseJob {
    private static String[] listJob;
    private static Job job;

    public DatabaseJob(Job job){
        this.job = job;
    }

    public static boolean addJob(Job job){
        return false;
    }

    public static boolean removeJob(Job job){
        return false;
    }

    public static Job getJob(){
        return job ;
    }

    public static String[] getListJob() {
        return listJob;
    }

}
