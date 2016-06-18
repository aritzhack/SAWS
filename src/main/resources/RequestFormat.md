Request format
==============

This document specifies the format of the data sent from the client
to the server as a request to run a remote method. These packets will be
in BDS format. Therefore, the following format will be serialized as a
single BDS structure.

Format
------

- BDS: "Request"
    - String: _Interface_ = Name of the interface where the method is declared.
    - String: _Name_ = Name of the remote method to be run.
    - String: _ReturnType_ = Fully qualified name of return type.
    - Integer: _Argc_ = Number of arguments the function takes.
    - BDS: "Arg<i>N</i>" = The <i>N</i>th argument for the method. Must be serialized using BDSUtil.(de)serialize(). N is a number from 0 (inclusive) to _Argc_ (exclusive). 