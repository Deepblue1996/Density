# Density

## 此版本存在小量BUG, 需要完美版本，建议使用本人DpWorkAX框架，经过商业实测敲打。

Android强制转换式屏幕适配方案
转载于https://juejin.im/post/5b3094fc6fb9a00e52398ae4

使用方法很简单，Application类中的onCreate()里添加

Density.setDensity(this, 360); // 360 指dpi

## How to
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
