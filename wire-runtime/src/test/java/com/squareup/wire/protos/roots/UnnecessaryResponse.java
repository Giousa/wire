// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/service_root.proto
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;

public final class UnnecessaryResponse extends Message {

  public UnnecessaryResponse() {
  }

  private UnnecessaryResponse(Builder builder) {
    super(builder);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof UnnecessaryResponse;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public static final class Builder extends Message.Builder<UnnecessaryResponse> {

    public Builder() {
    }

    public Builder(UnnecessaryResponse message) {
      super(message);
    }

    @Override
    public UnnecessaryResponse build() {
      return new UnnecessaryResponse(this);
    }
  }
}
