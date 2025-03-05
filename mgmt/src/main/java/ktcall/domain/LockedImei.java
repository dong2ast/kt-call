package ktcall.domain;

import java.time.LocalDate;
import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class LockedImei extends AbstractEvent {

    private Long id;
    private String phoneNumber;
    private String imei;

    public LockedImei(Mgmt aggregate) {
        super(aggregate);
    }

    public LockedImei() {
        super();
    }
}
//>>> DDD / Domain Event
