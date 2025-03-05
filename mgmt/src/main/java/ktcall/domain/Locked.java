package ktcall.domain;

import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class Locked extends AbstractEvent {

    private Long id;
    private Long phoneId;
    private String name;
    private String phoneNumber;
    private String reason;
    private String usim;
    private String imei;
}
