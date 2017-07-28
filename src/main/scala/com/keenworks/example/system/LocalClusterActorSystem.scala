package com.keenworks.example.system
import akka.actor.ActorSystem

object LocalClusterActorSystem {
    lazy val actorSystem = new LocalClusterActorSystem()
    def apply(): SampleActorSystem = actorSystem
}

class LocalClusterActorSystem extends SampleActorSystem {
    override def actorSystem: ActorSystem = ActorSystem("LocalCluster")
}
