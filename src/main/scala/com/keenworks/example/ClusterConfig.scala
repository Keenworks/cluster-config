package com.keenworks.example

import com.keenworks.example.system.SampleActorSystem
import com.keenworks.example.config.ModeConfig._

object ClusterConfig extends App {
    // TODO: Experiment with returning the actor system itself
    lazy val actorSystemContainer: SampleActorSystem = SampleActorSystem()
}
