
/**
 * DuplicateApiRequestFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.rsys.ws;

public class DuplicateApiRequestFault extends java.lang.Exception{

    private static final long serialVersionUID = 1435070939504L;
    
    private com.rsys.ws.fault.DuplicateApiRequestFault faultMessage;

    
        public DuplicateApiRequestFault() {
            super("DuplicateApiRequestFault");
        }

        public DuplicateApiRequestFault(java.lang.String s) {
           super(s);
        }

        public DuplicateApiRequestFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DuplicateApiRequestFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.rsys.ws.fault.DuplicateApiRequestFault msg){
       faultMessage = msg;
    }
    
    public com.rsys.ws.fault.DuplicateApiRequestFault getFaultMessage(){
       return faultMessage;
    }
}
    