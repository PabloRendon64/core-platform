package com.inditex.core.platform.domain.gateway;

import com.inditex.core.platform.domain.model.Price;

import java.time.OffsetDateTime;
import java.util.List;

public interface IPriceRepository {

    List<Price> searchByBrandIdAndProductIdAndQueryDateTime(OffsetDateTime queryDateTime, Long productId, Long brandId);

}
