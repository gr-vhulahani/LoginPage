public class User {

    private String stored_user_name = "john";
    private String user_name;

    private String stored_user_pass = "janedoe1";
    private String user_pass;

    //Getter for username

    public String getUsername(){
        return stored_user_name;
    }
    //Getter for password
    public String getPassword(){
        return stored_user_pass;
    }
    //Getter for password input
    public String getUsernameInput(){
        return user_name;
    }
    //Getter for input  username
    public String getPasswordInput(){
        return user_pass;
    }
    //Setter for username input
    public void setUsername(String user_name){
        this.user_name = user_name;
    }


    //Setter for password input
    public void setPassword(String user_pass){
        this.user_pass = user_pass;
    }



}
