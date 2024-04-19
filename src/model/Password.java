package model;

public class Password {
    private final String website;
    private final String username;
    protected final String encryptedPassword;
    private PasswordManager passwordManager;
    public Password(String website, String username, String encryptedPassword){
        this.website = website;
        this.username = username;
        this.encryptedPassword = encryptedPassword;
    }

}
