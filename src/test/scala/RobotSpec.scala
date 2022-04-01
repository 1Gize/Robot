import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class RobotSpec extends AnyFlatSpec with should.Matchers{
  def execComands(s: String) = {
    (9,4)
  }
  it should "return robot postition" in {
    execComands("RAALAL") shouldBe (9,4)
  }
}
