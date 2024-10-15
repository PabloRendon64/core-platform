package com.inditex.core.platform.entrypoint.controller;

import com.inditex.core.platform.entrypoint.contract.SearchPriceResponse;
import org.springframework.http.ResponseEntity;

import java.time.OffsetDateTime;

public interface IPriceApi {

    ResponseEntity<SearchPriceResponse> searchPriceOperation(OffsetDateTime queryDateTime, Long productId, Long brandId);

}
