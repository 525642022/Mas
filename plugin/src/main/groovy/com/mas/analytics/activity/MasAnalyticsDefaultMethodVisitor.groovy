package com.mas.analytics.activity

import com.mas.plugin.Logger
import org.objectweb.asm.*
import org.objectweb.asm.commons.AdviceAdapter

public class MasAnalyticsDefaultMethodVisitor extends AdviceAdapter {

    String methodName

    public MasAnalyticsDefaultMethodVisitor(MethodVisitor mv, int access, String name, String desc) {
        super(Opcodes.ASM5, mv, access, name, desc)
        methodName = name
        Logger.info("analy 开始扫描方法：${Logger.accCode2String(access)} ${methodName}${desc}")
    }

    /**
     * 表示 ASM 开始扫描这个方法
     */
    @Override
    void visitCode() {
        super.visitCode()
    }

    @Override
    public void visitMethodInsn(int opcode, String owner, String name, String desc) {
        super.visitMethodInsn(opcode, owner, name, desc)
    }

    @Override
    public void visitAttribute(Attribute attribute) {
        super.visitAttribute(attribute)
    }

    /**
     * 表示方法输出完毕
     */
    @Override
    public void visitEnd() {
        Logger.info("annly 结束扫描方法：${methodName}\n")
        super.visitEnd()
    }

    @Override
    public void visitFieldInsn(int opcode, String owner, String name, String desc) {
        super.visitFieldInsn(opcode, owner, name, desc)
    }

    @Override
    public void visitIincInsn(int var, int increment) {
        super.visitIincInsn(var, increment)
    }

    @Override
    public void visitIntInsn(int i, int i1) {
        super.visitIntInsn(i, i1)
    }

    /**
     * 该方法是 visitEnd 之前调用的方法，可以反复调用。用以确定类方法在执行时候的堆栈大小。
     * @param maxStack
     * @param maxLocals
     */
    @Override
    public void visitMaxs(int maxStack, int maxLocals) {
        super.visitMaxs(maxStack, maxLocals)
    }

    @Override
    public void visitVarInsn(int opcode, int var) {
        super.visitVarInsn(opcode, var)
    }

    @Override
    public void visitJumpInsn(int opcode, Label label) {
        super.visitJumpInsn(opcode, label)
    }

    @Override
    public void visitLookupSwitchInsn(Label label, int[] ints, Label[] labels) {
        super.visitLookupSwitchInsn(label, ints, labels)
    }

    @Override
    public void visitMultiANewArrayInsn(String s, int i) {
        super.visitMultiANewArrayInsn(s, i)
    }

    @Override
    public void visitTableSwitchInsn(int i, int i1, Label label, Label[] labels) {
        super.visitTableSwitchInsn(i, i1, label, labels)
    }

    @Override
    public void visitTryCatchBlock(Label label, Label label1, Label label2, String s) {
        super.visitTryCatchBlock(label, label1, label2, s)
    }

    @Override
    public void visitTypeInsn(int opcode, String s) {
        super.visitTypeInsn(opcode, s)
    }

    @Override
    public void visitLocalVariable(String s, String s1, String s2, Label label, Label label1, int i) {
        super.visitLocalVariable(s, s1, s2, label, label1, i)
    }

    @Override
    public void visitInsn(int opcode) {
        super.visitInsn(opcode)
    }

    @Override
    AnnotationVisitor visitAnnotation(String s, boolean b) {
        return super.visitAnnotation(s, b)
    }

    @Override
    protected void onMethodEnter() {
        super.onMethodEnter()
    }

    @Override
    protected void onMethodExit(int opcode) {
        super.onMethodExit(opcode)
    }
}