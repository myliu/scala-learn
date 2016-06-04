import scala.actors.Actor._

val echoActor = actor {
    while (true) {
        receive {
            case msg => println("received message: " + msg)
        }
    }
}

echoActor ! "Hi there!"