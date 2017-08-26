// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog/drink.proto

package io.prodrink.catalog.generated.domain;

public interface CategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:catalog.Category)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.catalog.Category parent_category = 3;</code>
   */
  boolean hasParentCategory();
  /**
   * <code>.catalog.Category parent_category = 3;</code>
   */
  io.prodrink.catalog.generated.domain.Category getParentCategory();
  /**
   * <code>.catalog.Category parent_category = 3;</code>
   */
  io.prodrink.catalog.generated.domain.CategoryOrBuilder getParentCategoryOrBuilder();

  /**
   * <code>repeated .catalog.PropertyType property_types = 4;</code>
   */
  java.util.List<io.prodrink.catalog.generated.domain.PropertyType> 
      getPropertyTypesList();
  /**
   * <code>repeated .catalog.PropertyType property_types = 4;</code>
   */
  io.prodrink.catalog.generated.domain.PropertyType getPropertyTypes(int index);
  /**
   * <code>repeated .catalog.PropertyType property_types = 4;</code>
   */
  int getPropertyTypesCount();
  /**
   * <code>repeated .catalog.PropertyType property_types = 4;</code>
   */
  java.util.List<? extends io.prodrink.catalog.generated.domain.PropertyTypeOrBuilder> 
      getPropertyTypesOrBuilderList();
  /**
   * <code>repeated .catalog.PropertyType property_types = 4;</code>
   */
  io.prodrink.catalog.generated.domain.PropertyTypeOrBuilder getPropertyTypesOrBuilder(
      int index);

  /**
   * <code>string image_url = 5;</code>
   */
  java.lang.String getImageUrl();
  /**
   * <code>string image_url = 5;</code>
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();
}