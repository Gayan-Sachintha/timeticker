/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;
import java.net.InterfaceAddress;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;


/**
 *
 * @author rockr
 */
public class EmailSending {

    
     public static void sendMail(String recepient) throws Exception {
         System.out.println("Preapring to send mail");
         
         
          Properties properties= new Properties();
          
     //Create email sending properties
     
    properties.put("mail.smtp.auth", "true");
     properties.put("mail.smtp.starttls.enable", "true");
     properties.put("mail.smtp.host", "smtp.gmail.com");
     properties.put("mail.smtp.port", "587");
     
       
     String MyaccountEmail= "rockrazith9@gmail.com";
     String Password= "razithZAH1234";
  
    Session session = Session.getInstance(properties,new Authenticator() {
    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication(MyaccountEmail, Password);
   }
    });
         Message message = prepareMessage(session,MyaccountEmail,recepient);
         Transport.send(message);
         
         System.out.println("Messege sent succesfully");
     }
     
     private static Message prepareMessage(Session session, String MyaccountEmail,String recepient){
         
            
         try {
             Message message = new MimeMessage(session);
             message.setFrom(new InternetAddress(MyaccountEmail));
             message.setRecipient(Message.RecipientType.TO,new InternetAddress(recepient));
             message.setSubject("My first email from java");
             message.setText("hey there look my email");
             return message;
         } catch (Exception ex) {
             java.util.logging.Logger.getLogger(EmailSending.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         
        
        
        return null;
         
     } 

    
}
