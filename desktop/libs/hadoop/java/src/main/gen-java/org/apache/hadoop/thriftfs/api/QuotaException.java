/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.thriftfs.api;

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

/**
 * Quota-related error
 */
public class QuotaException extends TException implements org.apache.thrift.TBase<QuotaException, QuotaException._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QuotaException");

  private static final org.apache.thrift.protocol.TField MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("msg", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STACK_FIELD_DESC = new org.apache.thrift.protocol.TField("stack", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QuotaExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QuotaExceptionTupleSchemeFactory());
  }

  /**
   * Error message.
   */
  public String msg; // required
  /**
   * Textual representation of the call stack.
   */
  public String stack; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Error message.
     */
    MSG((short)1, "msg"),
    /**
     * Textual representation of the call stack.
     */
    STACK((short)2, "stack");

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
        case 1: // MSG
          return MSG;
        case 2: // STACK
          return STACK;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MSG, new org.apache.thrift.meta_data.FieldMetaData("msg", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STACK, new org.apache.thrift.meta_data.FieldMetaData("stack", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QuotaException.class, metaDataMap);
  }

  public QuotaException() {
  }

  public QuotaException(
    String msg,
    String stack)
  {
    this();
    this.msg = msg;
    this.stack = stack;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QuotaException(QuotaException other) {
    if (other.isSetMsg()) {
      this.msg = other.msg;
    }
    if (other.isSetStack()) {
      this.stack = other.stack;
    }
  }

  public QuotaException deepCopy() {
    return new QuotaException(this);
  }

  @Override
  public void clear() {
    this.msg = null;
    this.stack = null;
  }

  /**
   * Error message.
   */
  public String getMsg() {
    return this.msg;
  }

  /**
   * Error message.
   */
  public QuotaException setMsg(String msg) {
    this.msg = msg;
    return this;
  }

  public void unsetMsg() {
    this.msg = null;
  }

  /** Returns true if field msg is set (has been assigned a value) and false otherwise */
  public boolean isSetMsg() {
    return this.msg != null;
  }

  public void setMsgIsSet(boolean value) {
    if (!value) {
      this.msg = null;
    }
  }

  /**
   * Textual representation of the call stack.
   */
  public String getStack() {
    return this.stack;
  }

  /**
   * Textual representation of the call stack.
   */
  public QuotaException setStack(String stack) {
    this.stack = stack;
    return this;
  }

  public void unsetStack() {
    this.stack = null;
  }

  /** Returns true if field stack is set (has been assigned a value) and false otherwise */
  public boolean isSetStack() {
    return this.stack != null;
  }

  public void setStackIsSet(boolean value) {
    if (!value) {
      this.stack = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MSG:
      if (value == null) {
        unsetMsg();
      } else {
        setMsg((String)value);
      }
      break;

    case STACK:
      if (value == null) {
        unsetStack();
      } else {
        setStack((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MSG:
      return getMsg();

    case STACK:
      return getStack();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MSG:
      return isSetMsg();
    case STACK:
      return isSetStack();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QuotaException)
      return this.equals((QuotaException)that);
    return false;
  }

  public boolean equals(QuotaException that) {
    if (that == null)
      return false;

    boolean this_present_msg = true && this.isSetMsg();
    boolean that_present_msg = true && that.isSetMsg();
    if (this_present_msg || that_present_msg) {
      if (!(this_present_msg && that_present_msg))
        return false;
      if (!this.msg.equals(that.msg))
        return false;
    }

    boolean this_present_stack = true && this.isSetStack();
    boolean that_present_stack = true && that.isSetStack();
    if (this_present_stack || that_present_stack) {
      if (!(this_present_stack && that_present_stack))
        return false;
      if (!this.stack.equals(that.stack))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(QuotaException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    QuotaException typedOther = (QuotaException)other;

    lastComparison = Boolean.valueOf(isSetMsg()).compareTo(typedOther.isSetMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.msg, typedOther.msg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStack()).compareTo(typedOther.isSetStack());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStack()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stack, typedOther.stack);
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
    StringBuilder sb = new StringBuilder("QuotaException(");
    boolean first = true;

    sb.append("msg:");
    if (this.msg == null) {
      sb.append("null");
    } else {
      sb.append(this.msg);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stack:");
    if (this.stack == null) {
      sb.append("null");
    } else {
      sb.append(this.stack);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class QuotaExceptionStandardSchemeFactory implements SchemeFactory {
    public QuotaExceptionStandardScheme getScheme() {
      return new QuotaExceptionStandardScheme();
    }
  }

  private static class QuotaExceptionStandardScheme extends StandardScheme<QuotaException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QuotaException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.msg = iprot.readString();
              struct.setMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STACK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stack = iprot.readString();
              struct.setStackIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, QuotaException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.msg != null) {
        oprot.writeFieldBegin(MSG_FIELD_DESC);
        oprot.writeString(struct.msg);
        oprot.writeFieldEnd();
      }
      if (struct.stack != null) {
        oprot.writeFieldBegin(STACK_FIELD_DESC);
        oprot.writeString(struct.stack);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QuotaExceptionTupleSchemeFactory implements SchemeFactory {
    public QuotaExceptionTupleScheme getScheme() {
      return new QuotaExceptionTupleScheme();
    }
  }

  private static class QuotaExceptionTupleScheme extends TupleScheme<QuotaException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QuotaException struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMsg()) {
        optionals.set(0);
      }
      if (struct.isSetStack()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMsg()) {
        oprot.writeString(struct.msg);
      }
      if (struct.isSetStack()) {
        oprot.writeString(struct.stack);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QuotaException struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.msg = iprot.readString();
        struct.setMsgIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stack = iprot.readString();
        struct.setStackIsSet(true);
      }
    }
  }

}

