# Toaster

![](/https://pandao.github.io/editor.md/images/logos/editormd-logo-180x180.png)

![](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat) ![](https://jitpack.io/v/4mirfor3v3r/Toaster.svg) ![](https://img.shields.io/badge/tag-1.0.0-brightgreen.svg?style=flat) ![](https://img.shields.io/badge/release-1.0.0-brightgreen.svg?style=flat) 

This is a simple to use layout as a toast

**Table of Contents**

/[TOCM]

/[TOC]

# Instalation

- ## Step 1
	- ### Prerequired
	Add it in your root/project level `build.gradle` at the end of repositories:

		```
		allprojects {
			repositories {
				...
				maven { url "https://jitpack.io" }
			}
		}
```
	- ### Add the Dependency
	Add this to your app level  `build.gradle` file

		```
		dependencies {
		        implementation 'com.github.4mirfor3v3r:Toaster:1.0.0'
		}
```

- ## Step 2 (Lets' Code)
	- ### Creating a layout for toast
  ```
  <androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    
    <LinearLayout
        android:background="@drawable/test"
        android:layout_width="200dp"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:gravity="center"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">
        <ImageView
            android:src="@mipmap/ic_launcher"
            android:layout_width="64dp"
            android:layout_height="64dp" />

        <TextView
            android:text="TEST 2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
        <TextView
            android:text="TEST 3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
    </LinearLayout>
  </androidx.constraintlayout.widget.ConstraintLayout>
    
	```
