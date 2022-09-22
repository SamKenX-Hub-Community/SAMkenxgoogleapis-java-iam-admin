/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

/**
 *
 *
 * <pre>
 * The service account key create request.
 * </pre>
 *
 * Protobuf type {@code google.iam.admin.v1.CreateServiceAccountKeyRequest}
 */
public final class CreateServiceAccountKeyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.admin.v1.CreateServiceAccountKeyRequest)
    CreateServiceAccountKeyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateServiceAccountKeyRequest.newBuilder() to construct.
  private CreateServiceAccountKeyRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateServiceAccountKeyRequest() {
    name_ = "";
    privateKeyType_ = 0;
    keyAlgorithm_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateServiceAccountKeyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateServiceAccountKeyRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              privateKeyType_ = rawValue;
              break;
            }
          case 24:
            {
              int rawValue = input.readEnum();

              keyAlgorithm_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_CreateServiceAccountKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_CreateServiceAccountKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.admin.v1.CreateServiceAccountKeyRequest.class,
            com.google.iam.admin.v1.CreateServiceAccountKeyRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
   * the account. The `ACCOUNT` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
   * the account. The `ACCOUNT` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIVATE_KEY_TYPE_FIELD_NUMBER = 2;
  private int privateKeyType_;
  /**
   *
   *
   * <pre>
   * The output format of the private key. The default value is
   * `TYPE_GOOGLE_CREDENTIALS_FILE`, which is the Google Credentials File
   * format.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccountPrivateKeyType private_key_type = 2;</code>
   *
   * @return The enum numeric value on the wire for privateKeyType.
   */
  @java.lang.Override
  public int getPrivateKeyTypeValue() {
    return privateKeyType_;
  }
  /**
   *
   *
   * <pre>
   * The output format of the private key. The default value is
   * `TYPE_GOOGLE_CREDENTIALS_FILE`, which is the Google Credentials File
   * format.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccountPrivateKeyType private_key_type = 2;</code>
   *
   * @return The privateKeyType.
   */
  @java.lang.Override
  public com.google.iam.admin.v1.ServiceAccountPrivateKeyType getPrivateKeyType() {
    @SuppressWarnings("deprecation")
    com.google.iam.admin.v1.ServiceAccountPrivateKeyType result =
        com.google.iam.admin.v1.ServiceAccountPrivateKeyType.valueOf(privateKeyType_);
    return result == null
        ? com.google.iam.admin.v1.ServiceAccountPrivateKeyType.UNRECOGNIZED
        : result;
  }

  public static final int KEY_ALGORITHM_FIELD_NUMBER = 3;
  private int keyAlgorithm_;
  /**
   *
   *
   * <pre>
   * Which type of key and algorithm to use for the key.
   * The default is currently a 2K RSA key.  However this may change in the
   * future.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccountKeyAlgorithm key_algorithm = 3;</code>
   *
   * @return The enum numeric value on the wire for keyAlgorithm.
   */
  @java.lang.Override
  public int getKeyAlgorithmValue() {
    return keyAlgorithm_;
  }
  /**
   *
   *
   * <pre>
   * Which type of key and algorithm to use for the key.
   * The default is currently a 2K RSA key.  However this may change in the
   * future.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccountKeyAlgorithm key_algorithm = 3;</code>
   *
   * @return The keyAlgorithm.
   */
  @java.lang.Override
  public com.google.iam.admin.v1.ServiceAccountKeyAlgorithm getKeyAlgorithm() {
    @SuppressWarnings("deprecation")
    com.google.iam.admin.v1.ServiceAccountKeyAlgorithm result =
        com.google.iam.admin.v1.ServiceAccountKeyAlgorithm.valueOf(keyAlgorithm_);
    return result == null
        ? com.google.iam.admin.v1.ServiceAccountKeyAlgorithm.UNRECOGNIZED
        : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (privateKeyType_
        != com.google.iam.admin.v1.ServiceAccountPrivateKeyType.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, privateKeyType_);
    }
    if (keyAlgorithm_
        != com.google.iam.admin.v1.ServiceAccountKeyAlgorithm.KEY_ALG_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, keyAlgorithm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (privateKeyType_
        != com.google.iam.admin.v1.ServiceAccountPrivateKeyType.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, privateKeyType_);
    }
    if (keyAlgorithm_
        != com.google.iam.admin.v1.ServiceAccountKeyAlgorithm.KEY_ALG_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, keyAlgorithm_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.iam.admin.v1.CreateServiceAccountKeyRequest)) {
      return super.equals(obj);
    }
    com.google.iam.admin.v1.CreateServiceAccountKeyRequest other =
        (com.google.iam.admin.v1.CreateServiceAccountKeyRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (privateKeyType_ != other.privateKeyType_) return false;
    if (keyAlgorithm_ != other.keyAlgorithm_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PRIVATE_KEY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + privateKeyType_;
    hash = (37 * hash) + KEY_ALGORITHM_FIELD_NUMBER;
    hash = (53 * hash) + keyAlgorithm_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.admin.v1.CreateServiceAccountKeyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountKeyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountKeyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountKeyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountKeyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountKeyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountKeyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.iam.admin.v1.CreateServiceAccountKeyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The service account key create request.
   * </pre>
   *
   * Protobuf type {@code google.iam.admin.v1.CreateServiceAccountKeyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.admin.v1.CreateServiceAccountKeyRequest)
      com.google.iam.admin.v1.CreateServiceAccountKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_CreateServiceAccountKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_CreateServiceAccountKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.admin.v1.CreateServiceAccountKeyRequest.class,
              com.google.iam.admin.v1.CreateServiceAccountKeyRequest.Builder.class);
    }

    // Construct using com.google.iam.admin.v1.CreateServiceAccountKeyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      privateKeyType_ = 0;

      keyAlgorithm_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_CreateServiceAccountKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.CreateServiceAccountKeyRequest getDefaultInstanceForType() {
      return com.google.iam.admin.v1.CreateServiceAccountKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.admin.v1.CreateServiceAccountKeyRequest build() {
      com.google.iam.admin.v1.CreateServiceAccountKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.CreateServiceAccountKeyRequest buildPartial() {
      com.google.iam.admin.v1.CreateServiceAccountKeyRequest result =
          new com.google.iam.admin.v1.CreateServiceAccountKeyRequest(this);
      result.name_ = name_;
      result.privateKeyType_ = privateKeyType_;
      result.keyAlgorithm_ = keyAlgorithm_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.iam.admin.v1.CreateServiceAccountKeyRequest) {
        return mergeFrom((com.google.iam.admin.v1.CreateServiceAccountKeyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.admin.v1.CreateServiceAccountKeyRequest other) {
      if (other == com.google.iam.admin.v1.CreateServiceAccountKeyRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.privateKeyType_ != 0) {
        setPrivateKeyTypeValue(other.getPrivateKeyTypeValue());
      }
      if (other.keyAlgorithm_ != 0) {
        setKeyAlgorithmValue(other.getKeyAlgorithmValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.iam.admin.v1.CreateServiceAccountKeyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.iam.admin.v1.CreateServiceAccountKeyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the service account in the following format:
     * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
     * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
     * the account. The `ACCOUNT` value can be the `email` address or the
     * `unique_id` of the service account.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the service account in the following format:
     * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
     * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
     * the account. The `ACCOUNT` value can be the `email` address or the
     * `unique_id` of the service account.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the service account in the following format:
     * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
     * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
     * the account. The `ACCOUNT` value can be the `email` address or the
     * `unique_id` of the service account.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the service account in the following format:
     * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
     * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
     * the account. The `ACCOUNT` value can be the `email` address or the
     * `unique_id` of the service account.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the service account in the following format:
     * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
     * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
     * the account. The `ACCOUNT` value can be the `email` address or the
     * `unique_id` of the service account.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private int privateKeyType_ = 0;
    /**
     *
     *
     * <pre>
     * The output format of the private key. The default value is
     * `TYPE_GOOGLE_CREDENTIALS_FILE`, which is the Google Credentials File
     * format.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccountPrivateKeyType private_key_type = 2;</code>
     *
     * @return The enum numeric value on the wire for privateKeyType.
     */
    @java.lang.Override
    public int getPrivateKeyTypeValue() {
      return privateKeyType_;
    }
    /**
     *
     *
     * <pre>
     * The output format of the private key. The default value is
     * `TYPE_GOOGLE_CREDENTIALS_FILE`, which is the Google Credentials File
     * format.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccountPrivateKeyType private_key_type = 2;</code>
     *
     * @param value The enum numeric value on the wire for privateKeyType to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateKeyTypeValue(int value) {

      privateKeyType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The output format of the private key. The default value is
     * `TYPE_GOOGLE_CREDENTIALS_FILE`, which is the Google Credentials File
     * format.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccountPrivateKeyType private_key_type = 2;</code>
     *
     * @return The privateKeyType.
     */
    @java.lang.Override
    public com.google.iam.admin.v1.ServiceAccountPrivateKeyType getPrivateKeyType() {
      @SuppressWarnings("deprecation")
      com.google.iam.admin.v1.ServiceAccountPrivateKeyType result =
          com.google.iam.admin.v1.ServiceAccountPrivateKeyType.valueOf(privateKeyType_);
      return result == null
          ? com.google.iam.admin.v1.ServiceAccountPrivateKeyType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The output format of the private key. The default value is
     * `TYPE_GOOGLE_CREDENTIALS_FILE`, which is the Google Credentials File
     * format.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccountPrivateKeyType private_key_type = 2;</code>
     *
     * @param value The privateKeyType to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateKeyType(com.google.iam.admin.v1.ServiceAccountPrivateKeyType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      privateKeyType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The output format of the private key. The default value is
     * `TYPE_GOOGLE_CREDENTIALS_FILE`, which is the Google Credentials File
     * format.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccountPrivateKeyType private_key_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrivateKeyType() {

      privateKeyType_ = 0;
      onChanged();
      return this;
    }

    private int keyAlgorithm_ = 0;
    /**
     *
     *
     * <pre>
     * Which type of key and algorithm to use for the key.
     * The default is currently a 2K RSA key.  However this may change in the
     * future.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccountKeyAlgorithm key_algorithm = 3;</code>
     *
     * @return The enum numeric value on the wire for keyAlgorithm.
     */
    @java.lang.Override
    public int getKeyAlgorithmValue() {
      return keyAlgorithm_;
    }
    /**
     *
     *
     * <pre>
     * Which type of key and algorithm to use for the key.
     * The default is currently a 2K RSA key.  However this may change in the
     * future.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccountKeyAlgorithm key_algorithm = 3;</code>
     *
     * @param value The enum numeric value on the wire for keyAlgorithm to set.
     * @return This builder for chaining.
     */
    public Builder setKeyAlgorithmValue(int value) {

      keyAlgorithm_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Which type of key and algorithm to use for the key.
     * The default is currently a 2K RSA key.  However this may change in the
     * future.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccountKeyAlgorithm key_algorithm = 3;</code>
     *
     * @return The keyAlgorithm.
     */
    @java.lang.Override
    public com.google.iam.admin.v1.ServiceAccountKeyAlgorithm getKeyAlgorithm() {
      @SuppressWarnings("deprecation")
      com.google.iam.admin.v1.ServiceAccountKeyAlgorithm result =
          com.google.iam.admin.v1.ServiceAccountKeyAlgorithm.valueOf(keyAlgorithm_);
      return result == null
          ? com.google.iam.admin.v1.ServiceAccountKeyAlgorithm.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Which type of key and algorithm to use for the key.
     * The default is currently a 2K RSA key.  However this may change in the
     * future.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccountKeyAlgorithm key_algorithm = 3;</code>
     *
     * @param value The keyAlgorithm to set.
     * @return This builder for chaining.
     */
    public Builder setKeyAlgorithm(com.google.iam.admin.v1.ServiceAccountKeyAlgorithm value) {
      if (value == null) {
        throw new NullPointerException();
      }

      keyAlgorithm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Which type of key and algorithm to use for the key.
     * The default is currently a 2K RSA key.  However this may change in the
     * future.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccountKeyAlgorithm key_algorithm = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKeyAlgorithm() {

      keyAlgorithm_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.iam.admin.v1.CreateServiceAccountKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.iam.admin.v1.CreateServiceAccountKeyRequest)
  private static final com.google.iam.admin.v1.CreateServiceAccountKeyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.admin.v1.CreateServiceAccountKeyRequest();
  }

  public static com.google.iam.admin.v1.CreateServiceAccountKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateServiceAccountKeyRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateServiceAccountKeyRequest>() {
        @java.lang.Override
        public CreateServiceAccountKeyRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateServiceAccountKeyRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateServiceAccountKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateServiceAccountKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.admin.v1.CreateServiceAccountKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
