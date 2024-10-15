package com.inditex.core.platform.infrastructure.persistence.mapper;

import com.inditex.core.platform.domain.model.Price;
import com.inditex.core.platform.infrastructure.persistence.entity.PriceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IPriceMapper {

    Price toPrice(PriceEntity priceEntity);

    List<Price> toPrices(List<PriceEntity> pricesEntities);

}
