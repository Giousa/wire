// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/redacted_test.proto
package com.squareup.wire.protos.redacted;

import com.google.protobuf.FieldOptions;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class RedactedRequired extends Message {

  public static final FieldOptions FIELD_OPTIONS_A = new FieldOptions.Builder()
      .setExtension(Ext_redacted_test.redacted, true)
      .build();

  public static final String DEFAULT_A = "";

  @ProtoField(
    tag = 1,
    type = STRING,
    label = REQUIRED,
    redacted = true
  )
  public final String a;

  public RedactedRequired(String a) {
    this.a = a;
  }

  private RedactedRequired(Builder builder) {
    super(builder);
    this.a = builder.a;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RedactedRequired)) return false;
    return equals(a, ((RedactedRequired) other).a);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = a != null ? a.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<RedactedRequired> {

    public String a;

    public Builder() {
    }

    public Builder(RedactedRequired message) {
      super(message);
      if (message == null) return;
      this.a = message.a;
    }

    public Builder a(String a) {
      this.a = a;
      return this;
    }

    @Override
    public RedactedRequired build() {
      checkRequiredFields();
      return new RedactedRequired(this);
    }
  }
}
