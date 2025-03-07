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
        report.report(reportCommand);
        reportRepository.save(report);
        return report;
    }
}
//>>> Clean Arch / Inbound Adaptor
