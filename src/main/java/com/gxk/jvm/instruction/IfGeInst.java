package com.gxk.jvm.instruction;

import com.gxk.jvm.rtda.Frame;

public class IfGeInst implements Instruction {
  public final int offset;

  public IfGeInst(int offset) {
    this.offset = offset;
  }

  @Override
  public int offset() {
    return 3;
  }

  @Override
  public void execute(Frame frame) {
    Integer val= frame.operandStack.popInt();
    if (val >= 0) {
      frame.nextPc = frame.thread.getPc() + offset;
    }
  }
}