package com.inditex.core.platform.domain.model;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class PriceSearchResults {

    private Long productId;
    private Long brandId;
    private Long priceList;
    private OffsetDateTime priceListStartDate;
    private OffsetDateTime priceListEndDate;
    private Double price;

}
