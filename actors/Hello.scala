import scala.actors._

object SillyActor extends Actor {
    def act() {
        for (i <- 1 to 5) {
            println("I am acting!")
            Thread.sleep(1000)
        }
    }
}

object SeriousActor extends Actor {
    def act() {
        for (i <- 1 to 5) {
            println("To be or not to be.")
            Thread.sleep(1000)
        }
    }
}

object Hello {
    def main(args: Array[String]) {
        SillyActor.start()
        SeriousActor.start()
    }
}