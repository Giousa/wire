// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/roots.proto
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Label.REQUIRED;

public final class B extends Message {

  @ProtoField(tag = 1, label = REQUIRED)
  public final C c;

  public B(C c) {
    this.c = c;
  }

  private B(Builder builder) {
    super(builder);
    this.c = builder.c;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof B)) return false;
    return equals(c, ((B) other).c);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = c != null ? c.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<B> {

    public C c;

    public Builder() {
    }

    public Builder(B message) {
      super(message);
      if (message == null) return;
      this.c = message.c;
    }

    public Builder c(C c) {
      this.c = c;
      return this;
    }

    @Override
    public B build() {
      checkRequiredFields();
      return new B(this);
    }
  }
}
