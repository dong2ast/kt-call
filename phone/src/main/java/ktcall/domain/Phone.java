package ktcall.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktcall.PhoneApplication;
import ktcall.domain.ChangedStatus;
import lombok.Data;

@Entity
@Table(name = "Phone_table")
@Data
//<<< DDD / Aggregate Root
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String owner;

    private String phoneNumber;

    private String usimStatus;

    private String imeiStatus;

    public static PhoneRepository repository() {
        PhoneRepository phoneRepository = PhoneApplication.applicationContext.getBean(
            PhoneRepository.class
        );
        return phoneRepository;
    }

    //<<< Clean Arch / Port Method
    public static void changeImeiStatus(LockedImei lockedImei) {
        //implement business logic here:

        /** Example 1:  new item 
        Phone phone = new Phone();
        repository().save(phone);

        ChangedStatus changedStatus = new ChangedStatus(phone);
        changedStatus.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(lockedImei.get???()).ifPresent(phone->{
            
            phone // do something
            repository().save(phone);

            ChangedStatus changedStatus = new ChangedStatus(phone);
            changedStatus.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeImeiStatus(UnlockedImei unlockedImei) {
        //implement business logic here:

        /** Example 1:  new item 
        Phone phone = new Phone();
        repository().save(phone);

        ChangedStatus changedStatus = new ChangedStatus(phone);
        changedStatus.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(unlockedImei.get???()).ifPresent(phone->{
            
            phone // do something
            repository().save(phone);

            ChangedStatus changedStatus = new ChangedStatus(phone);
            changedStatus.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeUsimStatus(LockedUsim lockedUsim) {
        //implement business logic here:

        /** Example 1:  new item 
        Phone phone = new Phone();
        repository().save(phone);

        ChangedStatus changedStatus = new ChangedStatus(phone);
        changedStatus.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(lockedUsim.get???()).ifPresent(phone->{
            
            phone // do something
            repository().save(phone);

            ChangedStatus changedStatus = new ChangedStatus(phone);
            changedStatus.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeUsimStatus(UnlockedUsim unlockedUsim) {
        //implement business logic here:

        /** Example 1:  new item 
        Phone phone = new Phone();
        repository().save(phone);

        ChangedStatus changedStatus = new ChangedStatus(phone);
        changedStatus.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(unlockedUsim.get???()).ifPresent(phone->{
            
            phone // do something
            repository().save(phone);

            ChangedStatus changedStatus = new ChangedStatus(phone);
            changedStatus.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
