import jdk.internal.org.objectweb.asm.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        ClassReader cr = new ClassReader(Hello.class.getName());
        ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_MAXS);
        ClassVisitor cv = new TestClassVisitor(cw);
        cr.accept(cv, Opcodes.ASM5);
        // 获取生成的class文件对应的二进制流
        byte[] code = cw.toByteArray();
        //将二进制流写到out/下
        FileOutputStream fos = new FileOutputStream("out/Hello.class");
        fos.write(code);
        fos.close();
    }

}




