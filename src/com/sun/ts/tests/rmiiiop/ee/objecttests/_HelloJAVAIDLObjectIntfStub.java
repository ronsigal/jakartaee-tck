/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

/*
 * $Id$
 */

package com.sun.ts.tests.rmiiiop.ee.objecttests;

/**
 * com/sun/ts/tests/rmiiiop/ee/objecttests/_HelloJAVAIDLObjectIntfStub.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.1" from
 * hello.idl Tuesday, August 27, 2002 3:27:59 PM PDT
 */

public class _HelloJAVAIDLObjectIntfStub
    extends org.omg.CORBA.portable.ObjectImpl
    implements com.sun.ts.tests.rmiiiop.ee.objecttests.HelloJAVAIDLObjectIntf {

  public String hello() {
    org.omg.CORBA.portable.InputStream $in = null;
    try {
      org.omg.CORBA.portable.OutputStream $out = _request("hello", true);
      $in = _invoke($out);
      String $result = $in.read_string();
      return $result;
    } catch (org.omg.CORBA.portable.ApplicationException $ex) {
      $in = $ex.getInputStream();
      String _id = $ex.getId();
      throw new org.omg.CORBA.MARSHAL(_id);
    } catch (org.omg.CORBA.portable.RemarshalException $rm) {
      return hello();
    } finally {
      _releaseReply($in);
    }
  } // hello

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
      "IDL:com/sun/ts/tests/rmiiiop/ee/objecttests/HelloJAVAIDLObjectIntf:1.0" };

  public String[] _ids() {
    return (String[]) __ids.clone();
  }

  private void readObject(java.io.ObjectInputStream s)
      throws java.io.IOException {
    String str = s.readUTF();
    String[] args = null;
    java.util.Properties props = null;
    org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init(args, props)
        .string_to_object(str);
    org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
        ._get_delegate();
    _set_delegate(delegate);
  }

  private void writeObject(java.io.ObjectOutputStream s)
      throws java.io.IOException {
    String[] args = null;
    java.util.Properties props = null;
    String str = org.omg.CORBA.ORB.init(args, props).object_to_string(this);
    s.writeUTF(str);
  }
} // class _HelloJAVAIDLObjectIntfStub
