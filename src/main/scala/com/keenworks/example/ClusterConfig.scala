package com.keenworks.example

import akka.stream.ActorMaterializer
import com.keenworks.example.config.ModeConfig._
import com.keenworks.example.system.SampleActorSystem

object ClusterConfig extends App {
    // TODO: Experiment with returning the actor system itself
    lazy val actorSystemContainer: SampleActorSystem = SampleActorSystem()
    implicit val actorSystem = actorSystemContainer.actorSystem
    lazy val materializer = ActorMaterializer()
}
