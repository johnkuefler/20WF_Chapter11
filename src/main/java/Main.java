
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Main {

    public static void main(String[] args) {
        User user = new User();
        
        try {
            user.setEmail("bademail");
        } catch (InvalidEmailFormatException ex) {
            // system generated exception handling code
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            System.out.println("Email cannot be empty!");
        }
        
        
        
        Scanner keyboard = new Scanner(System.in);
        
        String input ="";
        
        try 
        {
            input = keyboard.nextLine();
            int myNumber = Integer.parseInt(input);
            System.out.println("You entered a valid number: " + myNumber);
        } 
        catch (NumberFormatException ex) 
        {
            // do something with exception here
            System.out.println(ex.getMessage());
            System.out.println("Invalid number " + input + " entered");
        }
        catch (IllegalArgumentException ex) 
        {
            System.out.println("Illegal Argument!");
        }
        catch (Exception ex) 
        {
            System.out.println("Generic exception!");
        }
        finally 
        {
            System.out.println("Inside finally");
        }
        
        System.out.println("After try/catch");

    }
}
