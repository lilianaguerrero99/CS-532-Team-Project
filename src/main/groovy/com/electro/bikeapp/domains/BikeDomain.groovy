package com.electro.bikeapp.domains

import org.hibernate.annotations.CreationTimestamp
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import java.time.OffsetDateTime

@Entity
@Table(name = 'bike_inventory')
class BikeDomain {

    @Id
    @Column(name = 'bike_id')
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long bikeId

    @Column(name = 'bike_display_name')
    String bikeDisplayName

    @Column(name = 'added_by')
    String addedBy

    @CreationTimestamp
    @Column(name = 'added_date')
    OffsetDateTime addedDate

    @Column(name = 'make')
    String make

    @Column(name = 'model')
    String model

    @Column(name = 'color')
    String color

    @Column(name = 'wholesale_cost')
    BigDecimal wholesaleCost

    @Column(name = 'retail_cost')
    BigDecimal retailCost

    @Column(name = 'description')
    String description

    @Column(name = 'sold_by')
    String soldBy

    @Column(name = 'sold_date')
    OffsetDateTime soldDate

    @Column(name = 'in_stock')
    Boolean inStock

    @Column(name = 'bike_condition')
    String condition

    @Column(name = 'quantity')
    Integer quantity

}
