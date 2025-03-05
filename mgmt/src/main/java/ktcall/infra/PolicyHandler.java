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
    MgmtRepository mgmtRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Reported'"
    )
    public void wheneverReported_AddReport(@Payload Reported reported) {
        Reported event = reported;
        System.out.println(
            "\n\n##### listener AddReport : " + reported + "\n\n"
        );

        // Sample Logic //
        Mgmt.addReport(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CanceledReport'"
    )
    public void wheneverCanceledReport_DeleteReport(
        @Payload CanceledReport canceledReport
    ) {
        CanceledReport event = canceledReport;
        System.out.println(
            "\n\n##### listener DeleteReport : " + canceledReport + "\n\n"
        );

        // Sample Logic //
        Mgmt.deleteReport(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Locked'"
    )
    public void wheneverLocked_LockPhone(@Payload Locked locked) {
        Locked event = locked;
        System.out.println("\n\n##### listener LockPhone : " + locked + "\n\n");

        // Sample Logic //
        Mgmt.lockPhone(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Unlocked'"
    )
    public void wheneverUnlocked_UnlockedPhone(@Payload Unlocked unlocked) {
        Unlocked event = unlocked;
        System.out.println(
            "\n\n##### listener UnlockedPhone : " + unlocked + "\n\n"
        );

        // Sample Logic //
        Mgmt.unlockedPhone(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
