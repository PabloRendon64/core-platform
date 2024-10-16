package com.inditex.core.platform.domain.gateway;

import com.inditex.core.platform.domain.model.PriceSearchResult;

import java.time.OffsetDateTime;

public interface ISearchPrice {

    PriceSearchResult execute(OffsetDateTime queryDateTime, Long productId, Long brandId);

}
