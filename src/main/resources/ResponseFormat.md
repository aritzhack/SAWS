Response format
===============

This document specifies the format of the data answered from the server
to the client as a consequence of a previous request. These packets will
be in BDS format. Therefore, the following format will be serialized as
a single BDS structure.

It could also be an exception instead, in which case the "Value" BDS
will be replaced by the "Exception" BDS.

Format
------

- BDS: "Response"
    - String: _Interface_ = Fully qualified name of the interface where the method is declared.
    - String: _Name_ = Name of the remote method for which this is the response.
    - BDS: "Value" = The returned object serialized by means of BDSUtil.(de)serialize().
    - BDS: "Exception"
        - String: _Exception_ = Fully qualified name of the class of the Exception.
        - String: _Message_ = The message of the thrown exception.
        - String: _Stacktrace_ = Multiline string containing the stack trace in the server.