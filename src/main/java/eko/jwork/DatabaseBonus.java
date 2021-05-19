package eko.jwork;
import java.util.ArrayList;

public class DatabaseBonus {
    private static final ArrayList<Bonus> BONUS_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static final ArrayList<Bonus> getBonusDatabase() {
        return BONUS_DATABASE;
    }
    
    public static final int getLastId() {
        return lastId;
    }
    
    public static final Bonus gettBonusById(int id) throws BonusNotFoundException{
        for (Bonus bonus : BONUS_DATABASE) {
            if(bonus.getid() == id) {
                return bonus;
            }
        }
        throw new BonusNotFoundException(id);
    }

    public static final String getBonusByReferralCode(String referralCode) {
        for(Bonus bonus : BONUS_DATABASE) {
            if(bonus.getRefferalCode().equals(referralCode)) {
                return referralCode;
            }
        }
        return null;
    }

    public static final boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException{
        for(Bonus tester1 : BONUS_DATABASE){
            if(tester1.getRefferalCode().equals(bonus.getRefferalCode())){
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
            else{
                BONUS_DATABASE.add(bonus);
                lastId = bonus.getid() + 1;
            }
        }
        return true;
    }

    public static final boolean activateBonus(int id) {
        for(Bonus bonus : BONUS_DATABASE) {
            if(bonus.getid() == id) {
                bonus.setActive(true);
                return true;
            }
        }
        return false;
    }
    
    public static final boolean deactivateBonus(int id) {
        for(Bonus bonus : BONUS_DATABASE) {
            if(bonus.getid() == id) {
                bonus.setActive(false);
                return true;
            }
        }
        return false;
    }

    public static final boolean removeBonus(int id) throws BonusNotFoundException{
        for(Bonus bonus : BONUS_DATABASE) {
            if (bonus.getid() == id) {
                BONUS_DATABASE.remove(bonus);
                return true;
            }
        }
        throw new BonusNotFoundException(id);
    }
}
