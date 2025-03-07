package ktcall.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import ktcall.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/reports")
@Transactional
public class ReportController {

    @Autowired
    ReportRepository reportRepository;

    @RequestMapping(
        value = "/reports/{id}/cancelreport",
        method = RequestMethod.DELETE,
        produces = "application/json;charset=UTF-8"
    )
    public Report cancelReport(
        @PathVariable(value = "id") Long id,
        @RequestBody CancelReportCommand cancelReportCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /report/cancelReport  called #####");
        Optional<Report> optionalReport = reportRepository.findById(id);

        optionalReport.orElseThrow(() -> new Exception("No Entity Found"));
        Report report = optionalReport.get();
        report.cancelReport(cancelReportCommand);

        reportRepository.delete(report);
        return report;
    }

    @RequestMapping(
        value = "/reports/report",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Report report(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody ReportCommand reportCommand
    ) throws Exception {
        System.out.println("##### /report/report  called #####");
        Report report = new Report();
        reportRepository.save(report);
        report.report(reportCommand);
        return report;
    }

    @RequestMapping(
        value = "/reports/lock",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Report lock(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody LockCommand lockCommand
    ) throws Exception {
        System.out.println("##### /report/lock  called #####");
        Report report = new Report();
        report.lock(lockCommand);
        reportRepository.save(report);
        return report;
    }

    @RequestMapping(
        value = "/reports/{id}/unlock",
        method = RequestMethod.DELETE,
        produces = "application/json;charset=UTF-8"
    )
    public Report unlock(
        @PathVariable(value = "id") Long id,
        @RequestBody UnlockCommand unlockCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /report/unlock  called #####");
        Optional<Report> optionalReport = reportRepository.findById(id);

        optionalReport.orElseThrow(() -> new Exception("No Entity Found"));
        Report report = optionalReport.get();
        report.unlock(unlockCommand);

        reportRepository.delete(report);
        return report;
    }
}
//>>> Clean Arch / Inbound Adaptor
