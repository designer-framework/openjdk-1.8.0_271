package org.omg.CosNaming;


/**
* org/omg/CosNaming/NameComponent.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u271/605/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Wednesday, September 16, 2020 7:17:08 PM UTC
*/

public final class NameComponent implements org.omg.CORBA.portable.IDLEntity
{
  public String id = null;
  public String kind = null;

  public NameComponent ()
  {
  } // ctor

  public NameComponent (String _id, String _kind)
  {
    id = _id;
    kind = _kind;
  } // ctor

} // class NameComponent
