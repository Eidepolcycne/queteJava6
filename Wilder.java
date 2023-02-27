public class Wilder {

    // attributs  
    private String firstname;  
    private boolean aware;  

    // constructeurs  
    public Wilder(String firstname, boolean aware) {  
        this.firstname = firstname;  
        this.aware = false;  
    }  

    // accesseurs et mutateurs  
    public String getFirstname() {  
        return this.firstname;  
    }  

    public void setFirstName(String firstname) {  
        this.firstname = firstname;  
    }  

    public boolean isAware() {  
        return this.aware;  
    }  

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() { 
      if (isAware()==true) { 
        return "Je m'appelle " + this.getFirstname()  + " et je suis aware";
      }else{ return "Je m'appelle " + this.getFirstname()  + " et je ne suis pas aware";}
    }
}