package org.designer.test.faced;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/15 14:56
 */
public class NativeInvoke {

    static {
        System.loadLibrary("libshared_dll");
    }

    public static void main(String[] args) {
        NativeInvoke nativeInvoke = new NativeInvoke();
        System.out.println(nativeInvoke.invoke(9999L));
    }

    public native String invoke(long num);

    public String invoke0(long num) {
        return "X" + num;
    }

}
