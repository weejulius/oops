/**
 * Copyright
 */
package com.oopsday.adrop.domain.memory

import org.specs2.mutable._

class MemorySpec extends Specification{
  
  "The memory" should {
    "contain content" in {
     val memory =  Memory("it is a special memory")
     memory.content must be equalTo("it is a special memory")
    }

  }
 
} 

