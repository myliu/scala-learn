/*
 * To run:
 * cat input.txt | scala -nc FirstFP.scala
 */

import io.Source._

object Solution {

    def main(args: Array[String]) {
        println(io.Source.stdin.getLines().take(5).map(_.toInt).sum)
    }
}
