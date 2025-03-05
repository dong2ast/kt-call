package ktcall.infra;

import ktcall.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MgmtHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Mgmt>> {

    @Override
    public EntityModel<Mgmt> process(EntityModel<Mgmt> model) {
        return model;
    }
}
