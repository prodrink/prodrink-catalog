// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog/drink.proto

package io.prodrink.catalog.generated.domain;

/**
 * Protobuf enum {@code catalog.ValueType}
 */
public enum ValueType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INT32 = 0;</code>
   */
  INT32(0),
  /**
   * <code>INT64 = 1;</code>
   */
  INT64(1),
  /**
   * <code>FLOAT = 2;</code>
   */
  FLOAT(2),
  /**
   * <code>STRING = 3;</code>
   */
  STRING(3),
  /**
   * <code>BOOLEAN = 4;</code>
   */
  BOOLEAN(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INT32 = 0;</code>
   */
  public static final int INT32_VALUE = 0;
  /**
   * <code>INT64 = 1;</code>
   */
  public static final int INT64_VALUE = 1;
  /**
   * <code>FLOAT = 2;</code>
   */
  public static final int FLOAT_VALUE = 2;
  /**
   * <code>STRING = 3;</code>
   */
  public static final int STRING_VALUE = 3;
  /**
   * <code>BOOLEAN = 4;</code>
   */
  public static final int BOOLEAN_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ValueType valueOf(int value) {
    return forNumber(value);
  }

  public static ValueType forNumber(int value) {
    switch (value) {
      case 0: return INT32;
      case 1: return INT64;
      case 2: return FLOAT;
      case 3: return STRING;
      case 4: return BOOLEAN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ValueType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ValueType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ValueType>() {
          public ValueType findValueByNumber(int number) {
            return ValueType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.prodrink.catalog.generated.domain.DrinkOuter.getDescriptor().getEnumTypes().get(0);
  }

  private static final ValueType[] VALUES = values();

  public static ValueType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ValueType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:catalog.ValueType)
}

