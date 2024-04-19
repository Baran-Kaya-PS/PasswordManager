package model;

public class Password {
    private String website;
    private String username;
    protected String encryptedPassword;
    private PasswordManager passwordManager;
    public Password(String website, String username, String encryptedPassword){
        this.website = website;
        this.username = username;
        this.encryptedPassword = encryptedPassword;
    }

}
