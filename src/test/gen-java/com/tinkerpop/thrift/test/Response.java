/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.tinkerpop.thrift.test;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Response implements org.apache.thrift.TBase<Response, Response._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Response");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("result", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RES_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("resType", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ResponseTupleSchemeFactory());
  }

  public int id; // required
  public ByteBuffer result; // required
  /**
   * 
   * @see ArgType
   */
  public ArgType resType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    RESULT((short)2, "result"),
    /**
     * 
     * @see ArgType
     */
    RES_TYPE((short)3, "resType");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // RESULT
          return RESULT;
        case 3: // RES_TYPE
          return RES_TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RESULT, new org.apache.thrift.meta_data.FieldMetaData("result", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.RES_TYPE, new org.apache.thrift.meta_data.FieldMetaData("resType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ArgType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Response.class, metaDataMap);
  }

  public Response() {
  }

  public Response(
    int id,
    ByteBuffer result,
    ArgType resType)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.result = result;
    this.resType = resType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Response(Response other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetResult()) {
      this.result = org.apache.thrift.TBaseHelper.copyBinary(other.result);
;
    }
    if (other.isSetResType()) {
      this.resType = other.resType;
    }
  }

  public Response deepCopy() {
    return new Response(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.result = null;
    this.resType = null;
  }

  public int getId() {
    return this.id;
  }

  public Response setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public byte[] getResult() {
    setResult(org.apache.thrift.TBaseHelper.rightSize(result));
    return result == null ? null : result.array();
  }

  public ByteBuffer bufferForResult() {
    return result;
  }

  public Response setResult(byte[] result) {
    setResult(result == null ? (ByteBuffer)null : ByteBuffer.wrap(result));
    return this;
  }

  public Response setResult(ByteBuffer result) {
    this.result = result;
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  /** Returns true if field result is set (has been assigned a value) and false otherwise */
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean value) {
    if (!value) {
      this.result = null;
    }
  }

  /**
   * 
   * @see ArgType
   */
  public ArgType getResType() {
    return this.resType;
  }

  /**
   * 
   * @see ArgType
   */
  public Response setResType(ArgType resType) {
    this.resType = resType;
    return this;
  }

  public void unsetResType() {
    this.resType = null;
  }

  /** Returns true if field resType is set (has been assigned a value) and false otherwise */
  public boolean isSetResType() {
    return this.resType != null;
  }

  public void setResTypeIsSet(boolean value) {
    if (!value) {
      this.resType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((ByteBuffer)value);
      }
      break;

    case RES_TYPE:
      if (value == null) {
        unsetResType();
      } else {
        setResType((ArgType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Integer.valueOf(getId());

    case RESULT:
      return getResult();

    case RES_TYPE:
      return getResType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case RESULT:
      return isSetResult();
    case RES_TYPE:
      return isSetResType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Response)
      return this.equals((Response)that);
    return false;
  }

  public boolean equals(Response that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_result = true && this.isSetResult();
    boolean that_present_result = true && that.isSetResult();
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!this.result.equals(that.result))
        return false;
    }

    boolean this_present_resType = true && this.isSetResType();
    boolean that_present_resType = true && that.isSetResType();
    if (this_present_resType || that_present_resType) {
      if (!(this_present_resType && that_present_resType))
        return false;
      if (!this.resType.equals(that.resType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Response other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Response typedOther = (Response)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResult()).compareTo(typedOther.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result, typedOther.result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResType()).compareTo(typedOther.isSetResType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resType, typedOther.resType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Response(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("result:");
    if (this.result == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.result, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("resType:");
    if (this.resType == null) {
      sb.append("null");
    } else {
      sb.append(this.resType);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ResponseStandardSchemeFactory implements SchemeFactory {
    public ResponseStandardScheme getScheme() {
      return new ResponseStandardScheme();
    }
  }

  private static class ResponseStandardScheme extends StandardScheme<Response> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Response struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.result = iprot.readBinary();
              struct.setResultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RES_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.resType = ArgType.findByValue(iprot.readI32());
              struct.setResTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Response struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.result != null) {
        oprot.writeFieldBegin(RESULT_FIELD_DESC);
        oprot.writeBinary(struct.result);
        oprot.writeFieldEnd();
      }
      if (struct.resType != null) {
        oprot.writeFieldBegin(RES_TYPE_FIELD_DESC);
        oprot.writeI32(struct.resType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResponseTupleSchemeFactory implements SchemeFactory {
    public ResponseTupleScheme getScheme() {
      return new ResponseTupleScheme();
    }
  }

  private static class ResponseTupleScheme extends TupleScheme<Response> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Response struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetResult()) {
        optionals.set(1);
      }
      if (struct.isSetResType()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetResult()) {
        oprot.writeBinary(struct.result);
      }
      if (struct.isSetResType()) {
        oprot.writeI32(struct.resType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Response struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.result = iprot.readBinary();
        struct.setResultIsSet(true);
      }
      if (incoming.get(2)) {
        struct.resType = ArgType.findByValue(iprot.readI32());
        struct.setResTypeIsSet(true);
      }
    }
  }

}

