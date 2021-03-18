public class Location {
    private String province;
    private String city;
    private String description;

    public Location(String province, String city, String description){
        this.city = city;
        this.province = province;
        this.description = description;
    }

    public String getProvince(){
        return province;
    }

    public String getCity(){
        return city;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setProvince(String province){
        this.province = province;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String toString(){
        return province;
    }
        
    }
