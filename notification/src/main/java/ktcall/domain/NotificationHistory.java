package ktcall.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktcall.NotificationApplication;
import lombok.Data;

@Entity
@Table(name = "NotificationHistory_table")
@Data
//<<< DDD / Aggregate Root
public class NotificationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    private String from;

    private String to;

    private String platform;

    public static NotificationHistoryRepository repository() {
        NotificationHistoryRepository notificationHistoryRepository = NotificationApplication.applicationContext.getBean(
            NotificationHistoryRepository.class
        );
        return notificationHistoryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void pushNotification(Reported reported) {
        //implement business logic here:

        /** Example 1:  new item 
        NotificationHistory notificationHistory = new NotificationHistory();
        repository().save(notificationHistory);

        */

        /** Example 2:  finding and process
        
        // if reported.authId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> reportMap = mapper.convertValue(reported.getAuthId(), Map.class);

        repository().findById(reported.get???()).ifPresent(notificationHistory->{
            
            notificationHistory // do something
            repository().save(notificationHistory);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void pushNotification(CanceledReport canceledReport) {
        //implement business logic here:

        /** Example 1:  new item 
        NotificationHistory notificationHistory = new NotificationHistory();
        repository().save(notificationHistory);

        */

        /** Example 2:  finding and process
        
        // if canceledReport.authId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> reportMap = mapper.convertValue(canceledReport.getAuthId(), Map.class);

        repository().findById(canceledReport.get???()).ifPresent(notificationHistory->{
            
            notificationHistory // do something
            repository().save(notificationHistory);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void pushNotification(ChangedStatus changedStatus) {
        //implement business logic here:

        /** Example 1:  new item 
        NotificationHistory notificationHistory = new NotificationHistory();
        repository().save(notificationHistory);

        */

        /** Example 2:  finding and process
        
        // if changedStatus.phoneMgmtId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> phoneMap = mapper.convertValue(changedStatus.getPhoneMgmtId(), Map.class);

        repository().findById(changedStatus.get???()).ifPresent(notificationHistory->{
            
            notificationHistory // do something
            repository().save(notificationHistory);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void pushMessage(ChangedStatus changedStatus) {
        //implement business logic here:

        /** Example 1:  new item 
        NotificationHistory notificationHistory = new NotificationHistory();
        repository().save(notificationHistory);

        */

        /** Example 2:  finding and process
        
        // if changedStatus.phoneMgmtId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> phoneMap = mapper.convertValue(changedStatus.getPhoneMgmtId(), Map.class);

        repository().findById(changedStatus.get???()).ifPresent(notificationHistory->{
            
            notificationHistory // do something
            repository().save(notificationHistory);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
