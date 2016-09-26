/*
 * Copyright (C) 2009-2016 Lightbend Inc. <http://www.lightbend.com>
 */

package akka.http.impl.engine.http2

/** INTERNAL API */
private[akka] object Http2Compliance {

  final class IllegalHttp2StreamIdException(id: Int, expected: String) 
    extends IllegalArgumentException(s"Illegal HTTP/2 stream id: [$id]. $expected!") 
  
  // require methods use `if` because `require` allocates
  
  final def requirePositiveStreamId(id: Int): Unit = 
    if (id < 1) throw new IllegalHttp2StreamIdException(id, "MUST be > 0.") 
  
  final def requireZeroStreamId(id: Int): Unit = 
    if (id != 0) throw new IllegalHttp2StreamIdException(id, "MUST BE == 0.")
    
}
