package com.lenovo.leos.xdelta3;

/**
 * so 加载工具类
 */
public class Patch {
    private static boolean sIsPatchLoaded;

    static {
        try {
            System.loadLibrary("xdelta3");
            sIsPatchLoaded = true;
        } catch (Exception e) {
            sIsPatchLoaded = false;
        }

        System.out.println("hsc xdelta3 加载结果：" + sIsPatchLoaded);
    }

    public static boolean isSoLoaded() {
        return sIsPatchLoaded;
    }

    public static int applyPatch(String inPath, String srcPath, String outPath) {
        if (sIsPatchLoaded) {
            return nativePatch(0, inPath, srcPath, outPath);
        } else {
            System.out.println("hsc so库未加载");
            return -1;
        }
    }

    /**
     * native 方法定义 在[patcher.c]中实现
     *
     * @param encode  1编码/0解码 (低版本 apk + 差分包合成安装包传 0)
     * @param inPath  patch包路径
     * @param srcPath 旧版Apk包路径
     * @param outPath 合成的新包路径
     * @return 处理结果状态码，0成功/其他失败
     */
    private static native int nativePatch(int encode, String inPath, String srcPath, String outPath);
}
