package ktcall.infra;

import ktcall.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ReportHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Report>> {

    @Override
    public EntityModel<Report> process(EntityModel<Report> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/cancelreport")
                .withRel("cancelreport")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/report")
                .withRel("report")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/lock")
                .withRel("lock")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/unlock")
                .withRel("unlock")
        );

        return model;
    }
}
