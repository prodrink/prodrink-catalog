// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog/dto.proto

package io.prodrink.catalog.generated.dto;

public interface DrinkUpdateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:catalog.DrinkUpdateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 drink_id = 1;</code>
   */
  int getDrinkId();

  /**
   * <code>.catalog.Drink drink = 2;</code>
   */
  boolean hasDrink();
  /**
   * <code>.catalog.Drink drink = 2;</code>
   */
  io.prodrink.catalog.generated.domain.Drink getDrink();
  /**
   * <code>.catalog.Drink drink = 2;</code>
   */
  io.prodrink.catalog.generated.domain.DrinkOrBuilder getDrinkOrBuilder();
}
