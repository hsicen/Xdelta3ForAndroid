#ifndef PATCH_H_
#define PATCH_H_

#include <jni.h>

int registerNativeMethodsNativePatch(JNIEnv* env, const char* clazz);

#endif /* PATCH_H_ */
