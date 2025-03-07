package ktcall.domain;

import java.time.LocalDate;
import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AcceptedReport extends AbstractEvent {

    private Long id;
    private String phoneNumber;
    private String imei;
    private String usim;
    private String name;
    private String reason;
    private Long reportId;

    public AcceptedReport(Mgmt aggregate) {
        super(aggregate);
    }

    public AcceptedReport() {
        super();
    }
}
//>>> DDD / Domain Event
