package ktcall.domain;

import java.time.LocalDate;
import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ChangedStatus extends AbstractEvent {

    private Long id;
    private String owner;
    private String phoneNumber;
    private String usimStatus;
    private String imeiStatus;

    public ChangedStatus(Phone aggregate) {
        super(aggregate);
    }

    public ChangedStatus() {
        super();
    }
}
//>>> DDD / Domain Event
