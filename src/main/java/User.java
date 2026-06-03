public class User {

    // ==========================================
    // FIElDS
    // ==========================================

    private String stored_username = "john";
    private String newUsername;

    private String stored_userPassword = "janedoe1";
    private String userPassword;

    // ==========================================
    // GETTERS
    // ==========================================

    //Getter for username

    public String getUsername(){
        return stored_username;
    }
    //Getter for password
    public String getPassword(){
        return stored_userPassword;
    }
    //Getter for password input
    public String getUsernameInput(){
        return newUsername;
    }
    //Getter for input  username
    public String getPasswordInput(){
        return userPassword;
    }

    // ==========================================
    // SETTERS
    // ==========================================

    //Setter for username input
    public void setUsername(String username){
        this.stored_username = newUsername;
    }


    //Setter for password input
    public void setPassword(String user_pass){
        this.userPassword = userPassword;
    }



}
