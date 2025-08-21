package classe;

public class Client {
    private String identifiant; 
    private String password; 
    private String nomAgence; 
    private String email; 
    private String telephone; 

    
    public Client(String identifiant, String password, String nomAgence, String email, String telephone) {
        this.identifiant = identifiant;
        this.password = password;
        this.nomAgence = nomAgence;
        this.email = email;
        this.telephone = telephone;
    }

    
    public String getIdentifiant() {
        return identifiant;
    }

    public String getPassword() {
        return password;
    }

    public String getNomAgence() {
        return nomAgence;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    // Setters
    public void setLogin(String identifiant) {
        this.identifiant = identifiant;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNomAgence(String nomAgence) {
        this.nomAgence = nomAgence;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}