package com.electro.bikeapp.dtos

import java.time.OffsetDateTime

class CreateRetailOrderDTO {
    Long orderId
    String orderStatus
    Long customerId
    OffsetDateTime orderDate
    String shipMethod
    Float priceAmount
    String shippingAddress
}
