package com.electro.bikeapp.services

import com.electro.bikeapp.domains.RetailOrderDomain
import com.electro.bikeapp.dtos.CreateRetailOrderDTO
import com.electro.bikeapp.repositories.RetailOrderRepository
import org.springframework.beans.factory.annotation.Autowired

class RetailOrderService {
    @Autowired
    RetailOrderRepository retailOrderRepository
    void addRetailOrder(CreateRetailOrderDTO[] newRetailOrderParametersArray) {

        // loop through JSON array of new retail orders
        for (int i = 0; i < newRetailOrderParametersArray.size(); i++) {
            // For each retail order,
            // make a new instance of type retail order
            RetailOrderDomain retailOrder = new RetailOrderDomain()

            retailOrder.bikeId = newRetailOrderParametersArray[i].bikeId
            retailOrder.orderId = newRetailOrderParametersArray[i].orderId
            retailOrder.orderDate = newRetailOrderParametersArray[i].orderDate
            retailOrder.shipMethod = newRetailOrderParametersArray[i].shipMethod
            retailOrder.priceAmount = newRetailOrderParametersArray[i].priceAmount
            retailOrder.shippingAddress = newRetailOrderParametersArray[i].shippingAddress

            // save the retail order to database
            retailOrderRepository.save(retailOrder)
        }
    }
}
