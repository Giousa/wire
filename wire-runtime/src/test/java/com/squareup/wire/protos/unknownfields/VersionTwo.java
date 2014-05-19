// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/unknown_fields.proto
package com.squareup.wire.protos.unknownfields;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.FIXED32;
import static com.squareup.wire.Message.Datatype.FIXED64;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;

public final class VersionTwo extends Message {

  public static final Integer DEFAULT_I = 0;
  public static final Integer DEFAULT_V2_I = 0;
  public static final String DEFAULT_V2_S = "";
  public static final Integer DEFAULT_V2_F32 = 0;
  public static final Long DEFAULT_V2_F64 = 0L;

  @ProtoField(tag = 1, type = INT32)
  public final Integer i;

  @ProtoField(tag = 2, type = INT32)
  public final Integer v2_i;

  @ProtoField(tag = 3, type = STRING)
  public final String v2_s;

  @ProtoField(tag = 4, type = FIXED32)
  public final Integer v2_f32;

  @ProtoField(tag = 5, type = FIXED64)
  public final Long v2_f64;

  public VersionTwo(Integer i, Integer v2_i, String v2_s, Integer v2_f32, Long v2_f64) {
    this.i = i;
    this.v2_i = v2_i;
    this.v2_s = v2_s;
    this.v2_f32 = v2_f32;
    this.v2_f64 = v2_f64;
  }

  private VersionTwo(Builder builder) {
    super(builder);
    this.i = builder.i;
    this.v2_i = builder.v2_i;
    this.v2_s = builder.v2_s;
    this.v2_f32 = builder.v2_f32;
    this.v2_f64 = builder.v2_f64;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof VersionTwo)) return false;
    VersionTwo o = (VersionTwo) other;
    return equals(i, o.i)
        && equals(v2_i, o.v2_i)
        && equals(v2_s, o.v2_s)
        && equals(v2_f32, o.v2_f32)
        && equals(v2_f64, o.v2_f64);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = i != null ? i.hashCode() : 0;
      result = result * 37 + (v2_i != null ? v2_i.hashCode() : 0);
      result = result * 37 + (v2_s != null ? v2_s.hashCode() : 0);
      result = result * 37 + (v2_f32 != null ? v2_f32.hashCode() : 0);
      result = result * 37 + (v2_f64 != null ? v2_f64.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<VersionTwo> {

    public Integer i;
    public Integer v2_i;
    public String v2_s;
    public Integer v2_f32;
    public Long v2_f64;

    public Builder() {
    }

    public Builder(VersionTwo message) {
      super(message);
      if (message == null) return;
      this.i = message.i;
      this.v2_i = message.v2_i;
      this.v2_s = message.v2_s;
      this.v2_f32 = message.v2_f32;
      this.v2_f64 = message.v2_f64;
    }

    public Builder i(Integer i) {
      this.i = i;
      return this;
    }

    public Builder v2_i(Integer v2_i) {
      this.v2_i = v2_i;
      return this;
    }

    public Builder v2_s(String v2_s) {
      this.v2_s = v2_s;
      return this;
    }

    public Builder v2_f32(Integer v2_f32) {
      this.v2_f32 = v2_f32;
      return this;
    }

    public Builder v2_f64(Long v2_f64) {
      this.v2_f64 = v2_f64;
      return this;
    }

    @Override
    public VersionTwo build() {
      return new VersionTwo(this);
    }
  }
}
