package date_and_time_api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Demo {
    
    public static void main(String[] k){

        // Local date 
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        // Local Time
        LocalTime currenTime = LocalTime.now();
        System.out.println(currenTime); 

        // Local Date and Time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        // Formate date and time
        DateTimeFormatter formater1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formater1);
        System.out.println("Formatted date: "+formattedDate);
        
        // changing date formate
        DateTimeFormatter formater2 = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        String formatedDate2 = currentDate.format(formater2);
        System.out.println("Formated date: "+formatedDate2);

    }
}
