#include <jni.h>
#include <cstdlib>
#include <help/log.h>

#include "Patch.h"

jint JNI_OnLoad(JavaVM* vm, void* p) {
	JNIEnv* env;
	if (vm->GetEnv(reinterpret_cast<void**>(&env), JNI_VERSION_1_6) != JNI_OK) {
		LOGE("hsc", "JavaVM::GetEnv() failed");
		abort();
	}
	registerNativeMethodsNativePatch(env, "com/lenovo/leos/xdelta3");
	LOGE("hsc", "JNI_OnLoad OKAY");
	return JNI_VERSION_1_6;
}
