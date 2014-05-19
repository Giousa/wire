// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/redacted_test.proto
package com.squareup.wire.protos.redacted;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

public final class RedactedChild extends Message {

  public static final String DEFAULT_A = "";

  @ProtoField(tag = 1, type = STRING)
  public final String a;

  @ProtoField(tag = 2)
  public final Redacted b;

  @ProtoField(tag = 3)
  public final NotRedacted c;

  public RedactedChild(String a, Redacted b, NotRedacted c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  private RedactedChild(Builder builder) {
    super(builder);
    this.a = builder.a;
    this.b = builder.b;
    this.c = builder.c;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RedactedChild)) return false;
    RedactedChild o = (RedactedChild) other;
    return equals(a, o.a)
        && equals(b, o.b)
        && equals(c, o.c);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = a != null ? a.hashCode() : 0;
      result = result * 37 + (b != null ? b.hashCode() : 0);
      result = result * 37 + (c != null ? c.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<RedactedChild> {

    public String a;
    public Redacted b;
    public NotRedacted c;

    public Builder() {
    }

    public Builder(RedactedChild message) {
      super(message);
      if (message == null) return;
      this.a = message.a;
      this.b = message.b;
      this.c = message.c;
    }

    public Builder a(String a) {
      this.a = a;
      return this;
    }

    public Builder b(Redacted b) {
      this.b = b;
      return this;
    }

    public Builder c(NotRedacted c) {
      this.c = c;
      return this;
    }

    @Override
    public RedactedChild build() {
      return new RedactedChild(this);
    }
  }
}
