package com.driver;

import static java.lang.Character.isUpperCase;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(this.password==oldPassword){
            if(newPassword.length()>=8){
                boolean isUpperCase = false;
                boolean isLowerCase = false;
                boolean isDigit = false;
                boolean isSpecial = false;
                for(int i=0; i<newPassword.length(); i++){
                    char ch = newPassword.charAt(i);
                    if(Character.isUpperCase(ch)){
                        isUpperCase = true;
                    }
                    if(Character.isLowerCase(ch)){
                        isLowerCase = true;
                    }
                    if(Character.isDigit(ch)){
                        isDigit = true;
                    }
                    if(ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='^' || ch=='&' || ch=='*'){
                        isSpecial = true;
                    }
                }
                if(isUpperCase && isLowerCase && isDigit && isSpecial){
                    this.password = newPassword;
                }
            }
        }
    }
}
