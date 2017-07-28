package com.keenworks.example.config

import com.keenworks.example.system.{CloudCluster, LocalCluster, Mode, Standalone}
import com.typesafe.config.ConfigFactory
import org.slf4j.{Logger, LoggerFactory}

object ModeConfig {
    lazy val log: Logger = LoggerFactory.getLogger(getClass)
    lazy implicit val mode: Mode = {
        ConfigFactory.load().getString("system.mode") match {
            case "cloud-cluster" =>
                log.info("configured as CLOUD")
                CloudCluster
            case "local-cluster" =>
                log.info("configured as CLUSTER")
                LocalCluster
            case "standalone" =>
                log.info("configured as STANDALONE")
                Standalone
        }
    }
}
