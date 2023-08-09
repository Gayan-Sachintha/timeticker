package Utilities;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class GoogleMail
{
   public static void main(String[] args)
   {
      final String to = "rockrazith9@gmail.com";
      final String from = "sliit21error404@yahoo.com";

      String host = "smtp.mail.yahoo.com";
      Properties properties = System.getProperties();

      properties.put("mail.smtp.host", host);
      properties.put("mail.smtp.port", "587");
      properties.put("mail.smtp.starttls.enable", "true");
      properties.put("mail.smtp.auth", "true");

      Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
          
          @Override
          protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication("sliit21error404@yahoo.com", "jqgibixinizpqbyv");
          }
      });

      session.setDebug(true);
      try {
          MimeMessage message = new MimeMessage(session);

          message.setFrom(new InternetAddress(from));
          message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
          message.setSubject("This is the Subject Line!");
          message.setText("This is actual message");

          System.out.println("sending...");
          Transport.send(message);
          System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
          mex.printStackTrace();
      }
   }
}
