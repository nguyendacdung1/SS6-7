public class NativeModifier {
    native void nativeMethod();
    static {
        System.loadLibrary("NativemethodD√®ination");
    }

    public static void main(String[] args) {
        NativeModifier objNative = new NativeModifier();
        objNative.nativeMethod();
    }
}
