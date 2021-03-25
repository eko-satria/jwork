/**
 * Kelas memuat informasi yang dibutuhkan mengenai lokasi.
 * 
 * @author Eko Satria
 * @version 25-03-2021
 * 
 */

public class Location {         //kelas yang memuat informasi mengenai lokasi
    private String province;    //variabel privat untuk provinsi dari lokasi
    private String city;        //variabel privat untuk kota dari lokasi 
    private String description; //variabel privat untuk deskripsi dari lokasi

    /**
     * Costructor untuk kelas Location
     * @param city Kota dari lokasi, bernilai string
     * @param province Provinsi dari lokasi, bernilai string
     * @param description Deskripsi dari lokasi, bernilai string
     * @return nothing
     */

    public Location(String province, String city, String description){
        this.city = city;
        this.province = province;
        this.description = description;
    }

     /**
     * Metode accessor yang digunakan untuk mendapatkan provinsi dari lokasi
     * Metode akan mengembalikan nilai string
     * @param nothing
     * @return province Province of location
     */

    public String getProvince(){
        return province;
    }

    /**
     * Metode accessor yang digunakan untuk mendapatkan kota dari lokasi
     * Metode akan mengembalikan nilai string
     * @param nothing
     * @return city City of location
     */

    public String getCity(){
        return city;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan deskripsi dari lokasi
     * Metode akan mengembalikan nilai string
     * @param nothing
     * @return description Description of location
     */

    public String getDescription(){
        return description;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur provinsi dari lokasi
     * @param province Province of location
     * @return nothing
     */

    public void setProvince(String province){
        this.province = province;
    }

    /**
     * Metode mutator yang digunakan untuk mengatur kota dari lokasi
     * @param city City of location
     * @return nothing
     */
    
    public void setCity(String city){
        this.city = city;
    }

    /**
     * Metode mutator yang digunakan untuk mengatur deskripsi dari lokasi
     * @param description Description of location
     * @return nothing
     */

    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Metode yang digunakan untuk melakukan print terhadap variabel yang digunakan
     */
    
    public void printData(){
        System.out.println("City: " +getCity());
        System.out.println("Provinve: "+getProvince());
        System.out.println("Description: " +getDescription());
    }
    }    
