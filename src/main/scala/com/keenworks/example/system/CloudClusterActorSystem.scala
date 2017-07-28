package com.keenworks.example.system
import akka.actor.ActorSystem

object CloudClusterActorSystem{
    lazy val actorSystem = new CloudClusterActorSystem()
    def apply(): SampleActorSystem = actorSystem
}

class CloudClusterActorSystem extends SampleActorSystem {
    override def actorSystem: ActorSystem = ActorSystem("CloudCluster")
}
