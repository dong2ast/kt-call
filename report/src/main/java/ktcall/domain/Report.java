package ktcall.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktcall.ReportApplication;
import lombok.Data;

@Entity
@Table(name = "Report_table")
@Data
//<<< DDD / Aggregate Root
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String phoneNumber;

    private String reason;

    private String usim;

    private String imei;

    public static ReportRepository repository() {
        ReportRepository reportRepository = ReportApplication.applicationContext.getBean(
            ReportRepository.class
        );
        return reportRepository;
    }

    //<<< Clean Arch / Port Method
    public void cancelReport(CancelReportCommand cancelReportCommand) {
        //implement business logic here:

        CanceledReport canceledReport = new CanceledReport(this);
        canceledReport.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void report(ReportCommand reportCommand) {
        //implement business logic here:

        Reported reported = new Reported(this);
        reported.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void lock(LockCommand lockCommand) {
        //implement business logic here:

        Locked locked = new Locked(this);
        locked.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void unlock(UnlockCommand unlockCommand) {
        //implement business logic here:

        Unlocked unlocked = new Unlocked(this);
        unlocked.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void changeReportStatus(DeletedReport deletedReport) {
        //implement business logic here:

        /** Example 1:  new item 
        Report report = new Report();
        repository().save(report);

        */

        /** Example 2:  finding and process
        

        repository().findById(deletedReport.get???()).ifPresent(report->{
            
            report // do something
            repository().save(report);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeReportStatus(AcceptedReport acceptedReport) {
        //implement business logic here:

        /** Example 1:  new item 
        Report report = new Report();
        repository().save(report);

        */

        /** Example 2:  finding and process
        

        repository().findById(acceptedReport.get???()).ifPresent(report->{
            
            report // do something
            repository().save(report);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
