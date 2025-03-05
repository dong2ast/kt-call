package ktcall.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktcall.MgmtApplication;
import ktcall.domain.AcceptedReport;
import ktcall.domain.DeletedReport;
import ktcall.domain.LockedImei;
import ktcall.domain.LockedUsim;
import ktcall.domain.UnlockedImei;
import ktcall.domain.UnlockedUsim;
import lombok.Data;

@Entity
@Table(name = "Mgmt_table")
@Data
//<<< DDD / Aggregate Root
public class Mgmt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String phoneNumber;

    private String imei;

    private String usim;

    private String name;

    private String reason;

    public static MgmtRepository repository() {
        MgmtRepository mgmtRepository = MgmtApplication.applicationContext.getBean(
            MgmtRepository.class
        );
        return mgmtRepository;
    }

    //<<< Clean Arch / Port Method
    public static void addReport(Reported reported) {
        //implement business logic here:

        /** Example 1:  new item 
        Mgmt mgmt = new Mgmt();
        repository().save(mgmt);

        AcceptedReport acceptedReport = new AcceptedReport(mgmt);
        acceptedReport.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if reported.authId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> reportMap = mapper.convertValue(reported.getAuthId(), Map.class);

        repository().findById(reported.get???()).ifPresent(mgmt->{
            
            mgmt // do something
            repository().save(mgmt);

            AcceptedReport acceptedReport = new AcceptedReport(mgmt);
            acceptedReport.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void deleteReport(CanceledReport canceledReport) {
        //implement business logic here:

        /** Example 1:  new item 
        Mgmt mgmt = new Mgmt();
        repository().save(mgmt);

        DeletedReport deletedReport = new DeletedReport(mgmt);
        deletedReport.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if canceledReport.authId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> reportMap = mapper.convertValue(canceledReport.getAuthId(), Map.class);

        repository().findById(canceledReport.get???()).ifPresent(mgmt->{
            
            mgmt // do something
            repository().save(mgmt);

            DeletedReport deletedReport = new DeletedReport(mgmt);
            deletedReport.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void lockPhone(Locked locked) {
        //implement business logic here:

        /** Example 1:  new item 
        Mgmt mgmt = new Mgmt();
        repository().save(mgmt);

        LockedImei lockedImei = new LockedImei(mgmt);
        lockedImei.publishAfterCommit();
        LockedUsim lockedUsim = new LockedUsim(mgmt);
        lockedUsim.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if locked.authId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> reportMap = mapper.convertValue(locked.getAuthId(), Map.class);

        repository().findById(locked.get???()).ifPresent(mgmt->{
            
            mgmt // do something
            repository().save(mgmt);

            LockedImei lockedImei = new LockedImei(mgmt);
            lockedImei.publishAfterCommit();
            LockedUsim lockedUsim = new LockedUsim(mgmt);
            lockedUsim.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void unlockedPhone(Unlocked unlocked) {
        //implement business logic here:

        /** Example 1:  new item 
        Mgmt mgmt = new Mgmt();
        repository().save(mgmt);

        UnlockedImei unlockedImei = new UnlockedImei(mgmt);
        unlockedImei.publishAfterCommit();
        UnlockedUsim unlockedUsim = new UnlockedUsim(mgmt);
        unlockedUsim.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if unlocked.authId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> reportMap = mapper.convertValue(unlocked.getAuthId(), Map.class);

        repository().findById(unlocked.get???()).ifPresent(mgmt->{
            
            mgmt // do something
            repository().save(mgmt);

            UnlockedImei unlockedImei = new UnlockedImei(mgmt);
            unlockedImei.publishAfterCommit();
            UnlockedUsim unlockedUsim = new UnlockedUsim(mgmt);
            unlockedUsim.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
