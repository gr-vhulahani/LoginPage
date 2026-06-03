public class User {

    // Fields
    private String storedUsername = "john";
    private String inputUsername;

    private String storedPassword = "janedoe1";
    private String inputPassword;

    // Getters
    public String getUsername() {
        return storedUsername;
    }

    public String getPassword() {
        return storedPassword;
    }

    public String getUsernameInput() {
        return inputUsername;
    }

    public String getPasswordInput() {
        return inputPassword;
    }

    // Setters
    public void setUsername(String username) {
        this.inputUsername = username;
    }

    public void setPassword(String password) {
        this.inputPassword = password;
    }


}
