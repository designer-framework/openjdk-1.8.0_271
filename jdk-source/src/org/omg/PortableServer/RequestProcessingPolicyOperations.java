package org.omg.PortableServer;


/**
* org/omg/PortableServer/RequestProcessingPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u271/605/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, September 16, 2020 7:17:11 PM UTC
*/


/**
	 * This policy specifies how requests are processed by 
	 * the created POA.  The default is 
	 * USE_ACTIVE_OBJECT_MAP_ONLY.
	 */
public interface RequestProcessingPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
	 * specifies the policy value
	 */
  org.omg.PortableServer.RequestProcessingPolicyValue value ();
} // interface RequestProcessingPolicyOperations
