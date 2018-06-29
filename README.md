# Density

这是强制转换式屏幕适配方案
转载于https://juejin.im/post/5b3094fc6fb9a00e52398ae4

How to
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Deepblue1996:Density:1.0.1'
	}
