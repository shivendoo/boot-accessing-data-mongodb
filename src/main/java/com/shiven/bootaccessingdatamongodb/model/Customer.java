package com.shiven.bootaccessingdatamongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "customer")
public class Customer {

  @Id
  public String id;
  
  public String firstName;
  public String lastName;


}