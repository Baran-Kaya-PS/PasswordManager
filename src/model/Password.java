package model;

public class Password {
    private final String website;
    private final String username;
    protected final String encryptedPassword;
    private PasswordManager passwordManager;
    public Password(String website, String username, String encryptedPassword) throws NullPointerException {
        if (website == null || username == null || encryptedPassword == null) {
            throw new NullPointerException("Attributes must be not null");
        }
        this.website = website;
        this.username = username;
        this.encryptedPassword = encryptedPassword;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public String getUsername() {
        return username;
    }

    public String getWebsite() {
        return website;
    }
}
