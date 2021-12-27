/**
  * Rocket Chip UInt to One Hot 1 Converter
  * modified a/c to chisel 3.5
  * reference: https://github.com/chipsalliance/rocket-chip/blob/bd591ad2b8986b91d34b6bf52e10d208dfea5a2a/src/main/scala/util/package.scala#L189-L190
**/


package hive.utilities

import chisel3._ 
import chisel3.util._ 

class OneHot1Converter extends Module{
    val io = IO(new Bundle{
        val in = Input(UInt(10.W))
        val out = Output(UInt(10.W))
    })

    def UIntToOH1(x: UInt, width: Int): UInt = ~( ((-1).S(width.W)).asUInt << x )(width-1,0)

    io.out := UIntToOH1(io.in,10)
}