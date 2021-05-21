package eko.jwork.controller;

import eko.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/recruiter")
@RestController

public class RecruiterController {

    @RequestMapping(value = "/job", method = RequestMethod.GET)
    public ArrayList<Recruiter> getAllRecruiter() {
        ArrayList<Recruiter> recruiters;
        recruiters = DatabaseRecruiter.getRecruiterDatabase();
        return recruiters;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Recruiter getRecruiterById(@PathVariable int id)
    {
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(id);
        }
        catch (RecruiterNotFoundException e)
        {
            e.getMessage();
            return null;
        }
        return recruiter;
    }

    @RequestMapping(value = "/recruiter/", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value = "name") String name,
                      @RequestParam(value = "email") String  email,
                      @RequestParam(value = "phone Number") String phoneNumber,
                      @RequestParam(value = "province") String province,
                      @RequestParam(value = "description") String description,
                      @RequestParam(value = "city") String city) {
        Location location = new Location(city, description, province);
        Recruiter recruiter = new Recruiter(DatabaseRecruiter.getLastId()+1, name, email, phoneNumber, location);
        if (DatabaseRecruiter.addRecruiter(recruiter)){
            return recruiter;
        }
        return null;
    }

}
