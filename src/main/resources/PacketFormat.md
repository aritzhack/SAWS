TCP Packet format
=================

Since TCP is based on a byte stream instead of packet stream, we need to
specify a format to know where each packet begins and ends. This is the
format. Unless otherwise stated, all individual fields will be written
in big endian.

The payload will either be a Request packet, or a Response packet, as
seen in the documents next to this one.

Format
------

- Magic number for beginning of packet: 4 bytes = 0xBEEF
- Length of the payload, in bytes: Integer (4 bytes)
- Payload in BDS format
- Magic number for end of packet: 4 bytes = 0xFACE