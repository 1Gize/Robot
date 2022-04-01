import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class RobotSpec extends AnyFlatSpec with should.Matchers{
  it should "return robot postition(8,5) facing North for input  RAALAL and starting Robot(7,3,north)" in {
    val rob = new Robot(7,3,"north")
    rob.execCommadns("RAALAL")
    rob.x shouldBe 8
    rob.y shouldBe 5
    rob.direction shouldBe "west"
  }
}
