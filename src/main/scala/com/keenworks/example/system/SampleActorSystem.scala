package com.keenworks.example.system

import akka.actor.ActorSystem

object SampleActorSystem {
    def apply()(implicit systemType: Mode): SampleActorSystem = {
        systemType match {
            case Standalone =>
                StandaloneActorSystem()
            case LocalCluster =>
                LocalClusterActorSystem()
            case CloudCluster =>
                CloudClusterActorSystem()
        }
    }
}

abstract class SampleActorSystem {
    def actorSystem: ActorSystem
}