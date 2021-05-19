package firrtl_backend_confusing_error_reproduction_package

import chisel3.iotesters
import chisel3.iotesters.{ChiselFlatSpec, Driver, PeekPokeTester}

class firrtl_backend_confusing_error_reproduction_module_UnitTester(c: firrtl_backend_confusing_error_reproduction_module) extends PeekPokeTester(c) {
  
}


class firrtl_backend_confusing_error_reproduction_module_Tester extends ChiselFlatSpec {
  "firrtl_backend_confusing_error_reproduction_module_Test" should s" (with firrtl)" in {
    Driver.execute(Array("--generate-vcd-output", "on", "--backend-name", "firrtl", "--target-dir", "test_run_dir/", "--top-name", "firrtl_backend_confusing_error_reproduction_top"), () => new firrtl_backend_confusing_error_reproduction_module()) {
      c => new firrtl_backend_confusing_error_reproduction_module_UnitTester(c)
    } should be (true)
  }

  "firrtl_backend_confusing_error_reproduction_module_Test" should s" (with verilator)" in {
    Driver.execute(Array("--generate-vcd-output", "on", "--backend-name", "verilator", "--target-dir", "test_run_dir/", "--top-name", "firrtl_backend_confusing_error_reproduction_top"), () => new firrtl_backend_confusing_error_reproduction_module()) {
      c => new firrtl_backend_confusing_error_reproduction_module_UnitTester(c)
    } should be (true)
  }
}