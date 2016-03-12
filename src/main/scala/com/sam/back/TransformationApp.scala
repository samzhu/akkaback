package com.sam.back

object TransformationApp {
  def main(args: Array[String]): Unit = {
    // starting 3 backend nodes
    TransformationBackend.main(Array.empty)
    TransformationBackend.main(Array.empty)
    TransformationBackend.main(Array.empty)
  }
}
