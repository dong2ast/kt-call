package ktcall.domain;

import java.time.LocalDate;
import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class LockedUsim extends AbstractEvent {

    private Long id;
    private String phoneNumber;
    private String usim;

    public LockedUsim(Mgmt aggregate) {
        super(aggregate);
    }

    public LockedUsim() {
        super();
    }
}
//>>> DDD / Domain Event
