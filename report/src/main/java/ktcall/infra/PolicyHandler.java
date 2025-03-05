package ktcall.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import ktcall.config.kafka.KafkaProcessor;
import ktcall.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    ReportRepository reportRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeletedReport'"
    )
    public void wheneverDeletedReport_ChangeReportStatus(
        @Payload DeletedReport deletedReport
    ) {
        DeletedReport event = deletedReport;
        System.out.println(
            "\n\n##### listener ChangeReportStatus : " + deletedReport + "\n\n"
        );

        // Sample Logic //
        Report.changeReportStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AcceptedReport'"
    )
    public void wheneverAcceptedReport_ChangeReportStatus(
        @Payload AcceptedReport acceptedReport
    ) {
        AcceptedReport event = acceptedReport;
        System.out.println(
            "\n\n##### listener ChangeReportStatus : " + acceptedReport + "\n\n"
        );

        // Sample Logic //
        Report.changeReportStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
