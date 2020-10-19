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
the Facility and Severity elements. This could be modified
to make a variant that is portable to DFDL implementations
that do not support calculated elements.  