package pdf.example;

import java.io.*; 
import java.sql.*; 
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.general.DefaultPieDataset;

public class PieChart_DB
{
   public static void main( String[ ] args )throws Exception
   {
            
      /* Create MySQL Database Connection */
      Class.forName( "com.mysql.jdbc.Driver" );
      Connection connect = DriverManager.getConnection( 
      "jdbc:mysql://localhost:3306/mandavadb" ,     
      "root",     
      "root");
      
      Statement statement = connect.createStatement( );
      ResultSet resultSet = statement.executeQuery("select * from reg" );
      DefaultPieDataset dataset = new DefaultPieDataset( );
      while( resultSet.next( ) ) 
      {
         dataset.setValue( 
         resultSet.getString( "name" ) ,
         Double.parseDouble( resultSet.getString( "id" )));
      }
      JFreeChart chart = ChartFactory.createPieChart(
         "Mandava Register Users",  // chart title           
         dataset,         // data           
         true,            // include legend          
         true,           
         false );

      int width = 560; /* Width of the image */
      int height = 370; /* Height of the image */ 
      File pieChart = new File( "Pie_Chart_mandava.jpeg" );
      ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
   }
}