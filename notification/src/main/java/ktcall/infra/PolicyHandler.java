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
    NotificationHistoryRepository notificationHistoryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Reported'"
    )
    public void wheneverReported_PushNotification(@Payload Reported reported) {
        Reported event = reported;
        System.out.println(
            "\n\n##### listener PushNotification : " + reported + "\n\n"
        );

        // Sample Logic //
        NotificationHistory.pushNotification(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CanceledReport'"
    )
    public void wheneverCanceledReport_PushNotification(
        @Payload CanceledReport canceledReport
    ) {
        CanceledReport event = canceledReport;
        System.out.println(
            "\n\n##### listener PushNotification : " + canceledReport + "\n\n"
        );

        // Sample Logic //
        NotificationHistory.pushNotification(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ChangedStatus'"
    )
    public void wheneverChangedStatus_PushNotification(
        @Payload ChangedStatus changedStatus
    ) {
        ChangedStatus event = changedStatus;
        System.out.println(
            "\n\n##### listener PushNotification : " + changedStatus + "\n\n"
        );

        // Sample Logic //
        NotificationHistory.pushNotification(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ChangedStatus'"
    )
    public void wheneverChangedStatus_PushMessage(
        @Payload ChangedStatus changedStatus
    ) {
        ChangedStatus event = changedStatus;
        System.out.println(
            "\n\n##### listener PushMessage : " + changedStatus + "\n\n"
        );

        // Sample Logic //
        NotificationHistory.pushMessage(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
