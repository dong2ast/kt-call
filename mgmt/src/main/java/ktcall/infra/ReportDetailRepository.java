package ktcall.infra;

import java.util.List;
import ktcall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "reportDetails",
    path = "reportDetails"
)
public interface ReportDetailRepository
    extends PagingAndSortingRepository<ReportDetail, Long> {}
