package com.inditex.core.platform.entrypoint.controller;

import com.inditex.core.platform.domain.gateway.ISearchPrice;
import com.inditex.core.platform.domain.model.PriceSearchResult;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@Slf4j
@RestController
@RequestMapping("/price/")
@AllArgsConstructor
public class PriceController implements IPriceApi {

    private final ISearchPrice searchPrice;

    @Override
    @GetMapping("/search")
    public ResponseEntity<PriceSearchResult> searchPriceOperation(
            @RequestParam("query_date_time") OffsetDateTime queryDateTime,
            @RequestParam("product_id") Long productId,
            @RequestParam("brand_id") Long brandId) {
        log.info("searchPriceOperation queryDateTime: {} productId: {} brandId: {}", queryDateTime, productId, brandId);
        return ResponseEntity.ok(searchPrice.execute(queryDateTime, productId, brandId));
    }

}
