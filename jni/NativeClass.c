#include <stdio.h>
#include "NativeClass.h"

JNIEXPORT void JNICALL Java_NativeClass_nativeMethod(JNIEnv* env, jobject obj)
{
	printf("Gello");
}

