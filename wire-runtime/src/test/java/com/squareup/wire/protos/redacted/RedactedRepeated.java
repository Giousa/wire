// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/redacted_test.proto
package com.squareup.wire.protos.redacted;

import com.google.protobuf.FieldOptions;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;

public final class RedactedRepeated extends Message {

  public static final FieldOptions FIELD_OPTIONS_A = new FieldOptions.Builder()
      .setExtension(Ext_redacted_test.redacted, true)
      .build();

  public static final List<String> DEFAULT_A = Collections.emptyList();

  @ProtoField(
    tag = 1,
    type = STRING,
    label = REPEATED,
    redacted = true
  )
  public final List<String> a;

  public RedactedRepeated(List<String> a) {
    this.a = immutableCopyOf(a);
  }

  private RedactedRepeated(Builder builder) {
    super(builder);
    this.a = immutableCopyOf(builder.a);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RedactedRepeated)) return false;
    return equals(a, ((RedactedRepeated) other).a);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = a != null ? a.hashCode() : 1);
  }

  public static final class Builder extends Message.Builder<RedactedRepeated> {

    public List<String> a;

    public Builder() {
    }

    public Builder(RedactedRepeated message) {
      super(message);
      if (message == null) return;
      this.a = copyOf(message.a);
    }

    public Builder a(List<String> a) {
      this.a = checkForNulls(a);
      return this;
    }

    @Override
    public RedactedRepeated build() {
      return new RedactedRepeated(this);
    }
  }
}
