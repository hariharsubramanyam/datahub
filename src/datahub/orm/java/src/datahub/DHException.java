/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package datahub;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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

public class DHException extends TException implements org.apache.thrift.TBase<DHException, DHException._Fields>, java.io.Serializable, Cloneable, Comparable<DHException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DHException");

  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DETAILS_FIELD_DESC = new org.apache.thrift.protocol.TField("details", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DHExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DHExceptionTupleSchemeFactory());
  }

  public int errorCode; // optional
  public String message; // optional
  public String details; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR_CODE((short)1, "errorCode"),
    MESSAGE((short)2, "message"),
    DETAILS((short)3, "details");

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
        case 1: // ERROR_CODE
          return ERROR_CODE;
        case 2: // MESSAGE
          return MESSAGE;
        case 3: // DETAILS
          return DETAILS;
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
  private static final int __ERRORCODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.ERROR_CODE,_Fields.MESSAGE,_Fields.DETAILS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("errorCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DETAILS, new org.apache.thrift.meta_data.FieldMetaData("details", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DHException.class, metaDataMap);
  }

  public DHException() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DHException(DHException other) {
    __isset_bitfield = other.__isset_bitfield;
    this.errorCode = other.errorCode;
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    if (other.isSetDetails()) {
      this.details = other.details;
    }
  }

  public DHException deepCopy() {
    return new DHException(this);
  }

  @Override
  public void clear() {
    setErrorCodeIsSet(false);
    this.errorCode = 0;
    this.message = null;
    this.details = null;
  }

  public int getErrorCode() {
    return this.errorCode;
  }

  public DHException setErrorCode(int errorCode) {
    this.errorCode = errorCode;
    setErrorCodeIsSet(true);
    return this;
  }

  public void unsetErrorCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  /** Returns true if field errorCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return EncodingUtils.testBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  public void setErrorCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ERRORCODE_ISSET_ID, value);
  }

  public String getMessage() {
    return this.message;
  }

  public DHException setMessage(String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public String getDetails() {
    return this.details;
  }

  public DHException setDetails(String details) {
    this.details = details;
    return this;
  }

  public void unsetDetails() {
    this.details = null;
  }

  /** Returns true if field details is set (has been assigned a value) and false otherwise */
  public boolean isSetDetails() {
    return this.details != null;
  }

  public void setDetailsIsSet(boolean value) {
    if (!value) {
      this.details = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((Integer)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    case DETAILS:
      if (value == null) {
        unsetDetails();
      } else {
        setDetails((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_CODE:
      return Integer.valueOf(getErrorCode());

    case MESSAGE:
      return getMessage();

    case DETAILS:
      return getDetails();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERROR_CODE:
      return isSetErrorCode();
    case MESSAGE:
      return isSetMessage();
    case DETAILS:
      return isSetDetails();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DHException)
      return this.equals((DHException)that);
    return false;
  }

  public boolean equals(DHException that) {
    if (that == null)
      return false;

    boolean this_present_errorCode = true && this.isSetErrorCode();
    boolean that_present_errorCode = true && that.isSetErrorCode();
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (this.errorCode != that.errorCode)
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_details = true && this.isSetDetails();
    boolean that_present_details = true && that.isSetDetails();
    if (this_present_details || that_present_details) {
      if (!(this_present_details && that_present_details))
        return false;
      if (!this.details.equals(that.details))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(DHException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetErrorCode()).compareTo(other.isSetErrorCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorCode, other.errorCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDetails()).compareTo(other.isSetDetails());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDetails()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.details, other.details);
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
    StringBuilder sb = new StringBuilder("DHException(");
    boolean first = true;

    if (isSetErrorCode()) {
      sb.append("errorCode:");
      sb.append(this.errorCode);
      first = false;
    }
    if (isSetMessage()) {
      if (!first) sb.append(", ");
      sb.append("message:");
      if (this.message == null) {
        sb.append("null");
      } else {
        sb.append(this.message);
      }
      first = false;
    }
    if (isSetDetails()) {
      if (!first) sb.append(", ");
      sb.append("details:");
      if (this.details == null) {
        sb.append("null");
      } else {
        sb.append(this.details);
      }
      first = false;
    }
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

  private static class DHExceptionStandardSchemeFactory implements SchemeFactory {
    public DHExceptionStandardScheme getScheme() {
      return new DHExceptionStandardScheme();
    }
  }

  private static class DHExceptionStandardScheme extends StandardScheme<DHException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DHException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.errorCode = iprot.readI32();
              struct.setErrorCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DETAILS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.details = iprot.readString();
              struct.setDetailsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DHException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetErrorCode()) {
        oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
        oprot.writeI32(struct.errorCode);
        oprot.writeFieldEnd();
      }
      if (struct.message != null) {
        if (struct.isSetMessage()) {
          oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
          oprot.writeString(struct.message);
          oprot.writeFieldEnd();
        }
      }
      if (struct.details != null) {
        if (struct.isSetDetails()) {
          oprot.writeFieldBegin(DETAILS_FIELD_DESC);
          oprot.writeString(struct.details);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DHExceptionTupleSchemeFactory implements SchemeFactory {
    public DHExceptionTupleScheme getScheme() {
      return new DHExceptionTupleScheme();
    }
  }

  private static class DHExceptionTupleScheme extends TupleScheme<DHException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DHException struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetErrorCode()) {
        optionals.set(0);
      }
      if (struct.isSetMessage()) {
        optionals.set(1);
      }
      if (struct.isSetDetails()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetErrorCode()) {
        oprot.writeI32(struct.errorCode);
      }
      if (struct.isSetMessage()) {
        oprot.writeString(struct.message);
      }
      if (struct.isSetDetails()) {
        oprot.writeString(struct.details);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DHException struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.errorCode = iprot.readI32();
        struct.setErrorCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.message = iprot.readString();
        struct.setMessageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.details = iprot.readString();
        struct.setDetailsIsSet(true);
      }
    }
  }

}
