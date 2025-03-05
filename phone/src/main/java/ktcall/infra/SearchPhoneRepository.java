package ktcall.infra;

import java.util.List;
import ktcall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "searchPhones",
    path = "searchPhones"
)
public interface SearchPhoneRepository
    extends PagingAndSortingRepository<SearchPhone, Long> {}
