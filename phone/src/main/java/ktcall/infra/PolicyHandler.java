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
    PhoneRepository phoneRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LockedImei'"
    )
    public void wheneverLockedImei_ChangeImeiStatus(
        @Payload LockedImei lockedImei
    ) {
        LockedImei event = lockedImei;
        System.out.println(
            "\n\n##### listener ChangeImeiStatus : " + lockedImei + "\n\n"
        );

        // Sample Logic //
        Phone.changeImeiStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='UnlockedImei'"
    )
    public void wheneverUnlockedImei_ChangeImeiStatus(
        @Payload UnlockedImei unlockedImei
    ) {
        UnlockedImei event = unlockedImei;
        System.out.println(
            "\n\n##### listener ChangeImeiStatus : " + unlockedImei + "\n\n"
        );

        // Sample Logic //
        Phone.changeImeiStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LockedUsim'"
    )
    public void wheneverLockedUsim_ChangeUsimStatus(
        @Payload LockedUsim lockedUsim
    ) {
        LockedUsim event = lockedUsim;
        System.out.println(
            "\n\n##### listener ChangeUsimStatus : " + lockedUsim + "\n\n"
        );

        // Sample Logic //
        Phone.changeUsimStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='UnlockedUsim'"
    )
    public void wheneverUnlockedUsim_ChangeUsimStatus(
        @Payload UnlockedUsim unlockedUsim
    ) {
        UnlockedUsim event = unlockedUsim;
        System.out.println(
            "\n\n##### listener ChangeUsimStatus : " + unlockedUsim + "\n\n"
        );

        // Sample Logic //
        Phone.changeUsimStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
