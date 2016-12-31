# SquareFloatActionButton
Create square float action button using this example !!!
<br/>
In this example we are creating an square floating action button which will be different from float action button but working will be same!!!
<br/>
Also we have integrated expandable functionality of "read more" and "read less" in textview with a recyclerview.
Enjoy!!!
<br/>

Gradle
======

Step 1
--------------- 

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```

Step 2 
=======
Add the dependency

```
	dependencies {
	        compile 'com.github.HemendraGangwar:SquareFloatActionButton:5ba4f63e7f'
	}
```

Usage
=====

```
<com.hg.gangwar.squareFloat.HgSquareFloatButton
        android:id="@+id/squareFab"
        android:layout_width="110dp"
        android:layout_height="55dp"
        android:layout_alignParentBottom="true"
        android:layout_gravity="center_horizontal"
        android:layout_marginBottom="10dp"
        android:layout_marginTop="30dp"
        android:background="@drawable/drawable_fab_square_background"
        android:contentDescription="@null"
        android:elevation="5dp"
        android:padding="10dp"
        android:src="@drawable/drawable_fab_plus_icon" />
 
 ```


<br>
<img height="450" src= "https://cloud.githubusercontent.com/assets/11073070/21562125/e3a777e6-ce9b-11e6-9dbc-cd1e5dfa5a96.gif"/>
</br>
