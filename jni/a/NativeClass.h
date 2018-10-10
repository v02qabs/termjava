#include <jni.h>

#ifdef _Included_NativeClass
	#define _Included_NativeClass
#ifdef __cplusplus

extern "C"
{
#endif
	JNIEXPORT void JNICALL Java_NativeClass_nativeMethod(JNIEnv *, jobject);
#ifdef __cplusplus
}
#endif
#endif

