package com.inditex.core.platform.entrypoint.controller;

import com.inditex.core.platform.domain.model.PriceSearchResult;
import org.springframework.http.ResponseEntity;

import java.time.OffsetDateTime;

public interface IPriceApi {

    ResponseEntity<PriceSearchResult> searchPriceOperation(OffsetDateTime queryDateTime, Long productId, Long brandId);

}
