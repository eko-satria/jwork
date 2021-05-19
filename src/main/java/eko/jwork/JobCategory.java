package eko.jwork;
public enum JobCategory{
    WebDeveloper("WebDeveloper"),
    FrontEnd("FrontEnd"),
    BackEnd("BackEnd"),
    UI("UI"),
    UX("UX"),
    Devops("Devops"),
    DataScientist("DataScientist"),
    DataAnalyst("DataAnalyst");

    String category;

    JobCategory(String category){
        this.category = category;
    }

    public String toString(){
        return category;
    }
}