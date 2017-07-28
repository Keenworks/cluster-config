package com.keenworks.example.system
import akka.actor.ActorSystem

object StandaloneActorSystem {
    lazy val actorSystem = new StandaloneActorSystem()
    def apply(): SampleActorSystem = actorSystem
}

class StandaloneActorSystem extends SampleActorSystem {
    override def actorSystem: ActorSystem = ActorSystem("Standalone")
}
