package hive.utilities

import org.scalatest.FreeSpec
import chisel3._ 
import chiseltest._
import chiseltest.ChiselScalatestTester

class OneHot1ConverterTest extends FreeSpec with ChiselScalatestTester {
    "One Hot Conveter Test" in {
        test(new OneHot1Converter).withAnnotations(Seq(VerilatorBackendAnnotation)){ c =>
            c.io.in.poke(9.U)
            c.clock.step(10)
        }
    }
}