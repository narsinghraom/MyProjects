package mail.example;

import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  
  
public class SendMailBySite {  
 public static void main(String[] args) {  
  
  String host="gsmtp.gmail.com";//"smtp.gmail.com";  
  final String user="narsinghraom.dhatriinfo@gmail.com";//change accordingly  
  final String password="exception1";//change accordingly  
    
  String to="vanaja.n.dhatriinfo@gmail.com";//change accordingly  
  
   //Get the session object  
   Properties props = new Properties();  
   props.put("mail.smtp.host",host);  
   props.put("mail.smtp.auth", "true");  
     
   Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {  
      protected PasswordAuthentication getPasswordAuthentication() {  
    return new PasswordAuthentication(user,password);  
      }  
    });  
  
   //Compose the message  
    try {  
     MimeMessage message = new MimeMessage(session);  
     message.setFrom(new InternetAddress(user));  
     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
     message.setSubject("Example Program");  
     message.setText("This is simple program of sending email using JavaMail API");  
       
    //send the message  
     Transport.send(message);  
  
     System.out.println("message sent successfully...");  
   
     } catch (MessagingException e) {e.printStackTrace();}  
 }  
}  