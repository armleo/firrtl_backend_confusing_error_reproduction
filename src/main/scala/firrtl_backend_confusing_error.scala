package firrtl_backend_confusing_error_reproduction_package

import chisel3._
import chisel3.util._


class firrtl_backend_confusing_error_reproduction_module extends Module {
  val io = IO(new Bundle {
    val some_out = Output(Bool())
  })
  // Intentionally unitialized output
}