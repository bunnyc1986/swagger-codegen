package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
@Canonical
class Order {

    Long id = null

    Long petId = null

    Integer quantity = null

    Date shipDate = null

  /* Order Status */
  String status = null

    Boolean complete = false
  

}

