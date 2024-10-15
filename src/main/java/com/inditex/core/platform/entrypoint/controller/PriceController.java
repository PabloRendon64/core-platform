package com.inditex.core.platform.entrypoint.controller;

import com.inditex.core.platform.domain.gateway.ISearchPrice;
import com.inditex.core.platform.entrypoint.contract.SearchPriceResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/price/")
@AllArgsConstructor
public class PriceController implements IPriceApi {

    private final ISearchPrice searchPrice;

    @Override
    @GetMapping("/search")
    public ResponseEntity<SearchPriceResponse> searchPriceOperation(
            @RequestParam("query_date_time") OffsetDateTime queryDateTime,
            @RequestParam("product_id") Long productId,
            @RequestParam("brand_id") Long brandId) {
        return ResponseEntity.ok((SearchPriceResponse) searchPrice.execute(queryDateTime, productId, brandId));
    }

}
