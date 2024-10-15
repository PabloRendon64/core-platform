package com.inditex.core.platform.domain.gateway;

import com.inditex.core.platform.domain.model.PriceSearchResults;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.OffsetDateTime;

public interface ISearchPrice {

    PriceSearchResults execute(OffsetDateTime queryDateTime, Long productId, Long brandId);

}
