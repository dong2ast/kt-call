package ktcall.domain;

import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class DeletedReport extends AbstractEvent {

    private Long id;
}
