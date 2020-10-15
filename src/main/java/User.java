/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class User {
    private String email;
    private String userName;
    private String password;
    private float dailyLoggedOnHours;
    
    public User() {
        email = "";
        userName = "";
        password = "";
        dailyLoggedOnHours = 0;
    }

    public User(String email, String userName, String password, float dailyLoggedOnHours) throws InvalidEmailFormatException {
        setEmail(email);
        setUserName(userName);
        setPassword(password);
        setDailyLoggedOnHours(dailyLoggedOnHours);
    }

    public double calculateYearlyLoggedOnHours() {
        return this.dailyLoggedOnHours * 365;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidEmailFormatException {
        if (email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty!");
        }
        
        if (email.contains("@")) {        
            this.email = email;
        } else {
            throw new InvalidEmailFormatException("Invalid email address!");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getDailyLoggedOnHours() {
        return dailyLoggedOnHours;
    }

    public void setDailyLoggedOnHours(float dailyLoggedOnHours) {
        this.dailyLoggedOnHours = dailyLoggedOnHours;
    }
}
