package com.keenworks.example.system
import akka.actor.ActorSystem
import com.typesafe.config.{Config, ConfigFactory}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object LocalClusterActorSystem {
    lazy val actorSystem = new LocalClusterActorSystem()
    def apply(): SampleActorSystem = actorSystem
}

class LocalClusterActorSystem extends SampleActorSystem {
    val defaultConfig: Config = ConfigFactory.load()
    def clusterConfigFuture: Future[Config] = Future { defaultConfig.getConfig("cluster") withFallback defaultConfig }
    // Blocking sucks but the ActorSystem depends on this
    val clusterConfig: Config = Await.result(clusterConfigFuture, 30.seconds)
    log.info("Successfully awaited on clusterConfig.  Seed nodes: " + clusterConfig.getList("akka.cluster.seed-nodes").toString)

    override def actorSystem: ActorSystem = ActorSystem("LocalCluster", clusterConfig)
}
