// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/request_response.proto
package com.squareup.services.anotherpackage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;

public final class SendDataResponse extends Message {

  public static final ByteString DEFAULT_DATA = ByteString.EMPTY;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString data;

  public SendDataResponse(ByteString data) {
    this.data = data;
  }

  private SendDataResponse(Builder builder) {
    super(builder);
    this.data = builder.data;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SendDataResponse)) return false;
    return equals(data, ((SendDataResponse) other).data);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = data != null ? data.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<SendDataResponse> {

    public ByteString data;

    public Builder() {
    }

    public Builder(SendDataResponse message) {
      super(message);
      if (message == null) return;
      this.data = message.data;
    }

    public Builder data(ByteString data) {
      this.data = data;
      return this;
    }

    @Override
    public SendDataResponse build() {
      return new SendDataResponse(this);
    }
  }
}
