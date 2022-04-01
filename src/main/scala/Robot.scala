class Robot(x1: Int, y1: Int, dir: String) {
  var x: Int = x1
  var y: Int = y1
  var direction: String = dir
  def execCommadns(s: String) = {
    s.foreach {
      case 'L' =>
        direction match {
          case "north" => direction = "west"
          case "south" => direction = "east"
          case "east" => direction = "north"
          case "west" => direction = "south"
        }
      case 'R' => direction match{
        case "north" => direction = "east"
        case "south" => direction = "west"
        case "east" => direction = "south"
        case "west" => direction = "north"
      }
      case 'A' => direction match {
        case "north" => x = x + 1
        case "south" => x = x - 1
        case "east" => y = y + 1
        case "west" => y = y + 1
      }
    }
  }
}
