package mail.example;
import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  
public class SendMailExample 
{
	public static void main(String [] args){  
	      String to = "vanaja.n.dhatriinfo@gmail.com";//change accordingly  
	      String from = "narsinghraom.dhatriinfo@gmail.com";//change accordingly  
	      String host = "localhost";//or IP address  
	  
	     //Get the session object  
	      Properties properties = System.getProperties();  
	      properties.setProperty("mail.smtp.host", host);  
	      Session session = Session.getDefaultInstance(properties);  
	  
	     //compose the message  
	      try{  
	         MimeMessage message = new MimeMessage(session);  
	         message.setFrom(new InternetAddress(from));  
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
	         message.setSubject("HI");  
	         message.setText("Hello, Good AfterNoon  ");  
	  
	         // Send message  
	         Transport.send(message);  
	         System.out.println("message sent successfully....");  
	  
	      }catch (MessagingException mex) {mex.printStackTrace();}  
	   }  
	}  


