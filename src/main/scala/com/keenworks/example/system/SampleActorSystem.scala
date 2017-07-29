package com.keenworks.example.system

import akka.actor.ActorSystem
import org.slf4j.{Logger, LoggerFactory}

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
    lazy val log: Logger = LoggerFactory.getLogger(getClass)
    def actorSystem: ActorSystem
}