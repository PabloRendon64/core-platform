package com.inditex.core.platform.infrastructure.persistence.dao;

import com.inditex.core.platform.domain.gateway.IPriceRepository;
import com.inditex.core.platform.domain.model.Price;
import com.inditex.core.platform.infrastructure.persistence.mapper.IPriceMapper;
import com.inditex.core.platform.infrastructure.persistence.repository.IPriceJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PriceDao implements IPriceRepository {

    private final IPriceJpaRepository priceJpaRepository;
    private final IPriceMapper mapper;

    @Override
    public List<Price> searchByBrandIdAndProductIdAndQueryDateTime(OffsetDateTime queryDateTime, Long productId, Long brandId) {
        return mapper.toPrices(priceJpaRepository.findByBrandIdAndProductIdAndStartDateGreaterThanEqualAndEndDateLessThanEqual(brandId,
                productId, queryDateTime, queryDateTime));
    }
}
