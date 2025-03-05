package ktcall.domain;

import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class AcceptedReport extends AbstractEvent {

    private Long id;
    private String phoneNumber;
    private String imei;
    private String usim;
    private String name;
    private String reason;
}
