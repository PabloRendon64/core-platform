package com.inditex.core.platform.domain.usecase;

import com.inditex.core.platform.domain.gateway.IPriceRepository;
import com.inditex.core.platform.domain.gateway.ISearchPrice;
import com.inditex.core.platform.domain.model.PriceSearchResults;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Slf4j
@Service
@AllArgsConstructor
public class SearchPrice implements ISearchPrice {

    private IPriceRepository priceRepository;

    @Override
    public PriceSearchResults execute(OffsetDateTime queryDateTime, Long productId, Long brandId) {
        var searchResults = priceRepository.searchByBrandIdAndProductIdAndQueryDateTime(queryDateTime, productId, brandId);
        log.info("message {}", searchResults);
        return null;
    }

}
