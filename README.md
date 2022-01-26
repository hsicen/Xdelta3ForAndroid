# Xdelta3ForAndroid
xdelta3 build for android platform.

based on [xdelta](https://github.com/jmacd/xdelta) 3.0.11 sources. changed data type range and enlarged memory allocate in xdelta3.c.

Steps to build as follows:

- make your own jni interface, such as `Patch.java`in this project.
- make the implementation of jni interface in jni package, such as `patcher.c`in this project.
- make `Android.mk`to config environment.
- make `Application.mk`to config so results and android platform level.
- go to jni package，excute `ndk-build`command, the so files will be produced.

if you think the above make you confused, you can just copy the so files and `Patch.java`in this project, take care of the `Patcher.java`file path, if not same with it's origin, will not find the implementation.

