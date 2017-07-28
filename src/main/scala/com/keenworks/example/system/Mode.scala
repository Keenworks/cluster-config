package com.keenworks.example.system

sealed trait Mode

object Standalone extends Mode
object LocalCluster extends Mode
object CloudCluster extends Mode
