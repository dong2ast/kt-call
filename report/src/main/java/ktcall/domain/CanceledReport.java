package ktcall.domain;

import java.time.LocalDate;
import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CanceledReport extends AbstractEvent {

    private Long id;
    private String reportId;

    public CanceledReport(Report aggregate) {
        super(aggregate);
    }

    public CanceledReport() {
        super();
    }
}
//>>> DDD / Domain Event
