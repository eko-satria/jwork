import java.util.ArrayList;

public class DatabaseBonus {
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase() {
        return BONUS_DATABASE;
    }
    
    public static int getLastId() {
        return lastId;
    }
    
    public static Bonus gettBonusById(int id) {
        for (Bonus bonus : BONUS_DATABASE) {
            if(bonus.getid() == id) {
                return bonus;
            }
        }
        return null;
    }

    public static String getBonusByReferralCode(String referralCode) {
        for(Bonus bonus : BONUS_DATABASE) {
            if(bonus.getRefferalCode().equals(referralCode)) {
                return referralCode;
            }
        }
        return null;
    }

    public static boolean addBonus(Bonus bonus) {
        for(Bonus tester1 : BONUS_DATABASE){
            if(tester1.getRefferalCode().equals(bonus.getRefferalCode())){
                return false;
            }
            else{
                BONUS_DATABASE.add(bonus);
                lastId = bonus.getid() + 1;
            }
        }
        return true;
    }

    public static boolean activateBonus(int id) {
        for(Bonus bonus : BONUS_DATABASE) {
            if(bonus.getid() == id) {
                bonus.setActive(true);
                return true;
            }
        }
        return false;
    }
    
    public static boolean deactivateBonus(int id) {
        for(Bonus bonus : BONUS_DATABASE) {
            if(bonus.getid() == id) {
                bonus.setActive(false);
                return true;
            }
        }
        return false;
    }

    public static boolean removeBonus(int id) {
        for(Bonus bonus : BONUS_DATABASE) {
            if (bonus.getid() == id) {
                BONUS_DATABASE.remove(bonus);
                return true;
            }
        }
        return false;
    }
}
