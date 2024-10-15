package com.inditex.core.platform.infrastructure.persistence.repository;

import com.inditex.core.platform.infrastructure.persistence.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.OffsetDateTime;
import java.util.List;

public interface IPriceJpaRepository extends JpaRepository<PriceEntity, Long> {

    List<PriceEntity> findByBrandIdAndProductIdAndStartDateGreaterThanEqualAndEndDateLessThanEqual(
            Long brandId, Long productId, OffsetDateTime startDate, OffsetDateTime endDate);

}
