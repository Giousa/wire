// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/service_root.proto
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;

public final class TheRequest extends Message {

  public TheRequest() {
  }

  private TheRequest(Builder builder) {
    super(builder);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof TheRequest;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public static final class Builder extends Message.Builder<TheRequest> {

    public Builder() {
    }

    public Builder(TheRequest message) {
      super(message);
    }

    @Override
    public TheRequest build() {
      return new TheRequest(this);
    }
  }
}
