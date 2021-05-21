package eko.jwork.controller;

import eko.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/bonus")
@RestController

public class BonusController {

    @RequestMapping(value = "/bonus", method = RequestMethod.GET)
    public ArrayList<Bonus> getAllJob()
    {
        ArrayList<Bonus> bonuses;
        bonuses = DatabaseBonus.getBonusDatabase();
        return bonuses;
    }

    @RequestMapping(value = "/{referralCode}", method = RequestMethod.GET)
    public Bonus getBonusByReferralCode(@PathVariable String code)
    {
        Bonus bonus=null;
        bonus =DatabaseBonus.getBonusByReferralCode(bonus);
        return bonus;
    }

    @RequestMapping(value = "/bonus/", method = RequestMethod.POST)
    public Bonus addBonus(@RequestParam(value = "discount") String referralCode,
                          @RequestParam(value = "minPrice") int extraFee,
                          @RequestParam(value = "minTotalFee") int minTotalFee,
                          @RequestParam(value = "active")boolean active){
        Bonus bonus = new Bonus(DatabaseBonus.getLastId()+1, referralCode, extraFee, minTotalFee, active );
        try {
            DatabaseBonus.addBonus(bonus);
        } catch (ReferralCodeAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
        return bonus;
    }
}
