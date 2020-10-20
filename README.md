Syslog Protocol DFDL Schema
====
Support for:
- RFC-5424
- RFC-3164
- Cisco
- ESXi

There are two root elements to choose from:

Syslog - straight RFC 5423 logging

SolarwindsSyslog - The combined Solarwinds Syslog
format which supports all the above-listed formats. 

This schema works with the Daffodil DFDL implementation.
It uses dfdl:inputValueCalc and dfdl:outputValueCalc in 
the Facility and Severity elements. 

A portable version works also with IBM DFDL.
This doesn't parse the Prival information into
Facility and Severity, but is otherwise identical.   

Change History

* 0.1.0: Initial support for RFC-5424, RFC-3164 and Cisco
* 0.1.1: Support for ESXi
* 0.1.2: Support for Solarwinds as well as standard Syslog in same schema.
* 1.0.0: Portable variant that works with IBM DFDL.
Removed version number from namespace URI. 
Changed branding from Tresys to Owl. 

