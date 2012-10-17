package spec2test

import org.specs2.Specification

/**
 * User: wee
 * Date: 10/18/12
 */
class AcceptanceTest extends Specification {
  def is =
    "this is my specification" ^
      "and example 1" ! e1 ^
      "and example 2" ! e2



  def e1 = success

  def e2 = done
}
