package com.keenworks.example.system

import akka.actor.ActorSystem

object CloudClusterActorSystem{
    lazy val actorSystem = new CloudClusterActorSystem()
    def apply(): SampleActorSystem = actorSystem
}

class CloudClusterActorSystem extends LocalClusterActorSystem {
//    override def clusterConfigFuture: Future[Config] = {
//        // logic to figure out seed nodes goes here - through AWS or some other way like Consul
//        // ConstructR, Consul, system would also register its own IP with Consul here too I guess?
//        // after getting ips, refer to akka-cluster-aws sample project for how to create config entry
//        // This system won't function until seed nodes are supplied to it
//    }
    override def actorSystem: ActorSystem = ActorSystem("CloudCluster", clusterConfig)
}
