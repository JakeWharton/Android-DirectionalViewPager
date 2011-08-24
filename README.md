Android VerticalViewPager
=========================

Vertical implementation of the [compatibility library][1] `ViewPager` class.



Usage
=====

*For a working implementation of this project see the `sample/` folder.*

  1. Include the widget in your view.

        <com.jakewharton.android.verticalviewpager.VerticalViewPager
            android:id="@+id/pager"
            android:layout_height="fill_parent"
            android:layout_width="fill_parent" />

  2. In your `onCreate` method (or `onCreateView` for a fragment), bind the
     indicator to a `PagerAdapter` implementation.

         VerticalViewPager pager = (VerticalViewPager)findViewById(R.id.pager);
         pager.setAdapter(new TestAdapter(getSupportFragmentManager()));


Including In Your Project
-------------------------

Android-ViewPagerIndicator is presented as a standalone `.jar` file. It should
included in addition to the compatibility library `.jar`.

You can download the file from the GitHub [downloads page][2] or compile your
own by running `mvn clean package` (it will be in the `target/` folder).

If you are using maven you can easily include the library by specifying it
as a dependency:

    <dependency>
      <groupId>com.jakewharton</groupid>
      <artifactId>android-verticalviewpager</artifactId>
      <version>1.0.0</version>
    </dependency>

You must also include the following repository:

    <repository>
      <id>com.jakewharton</id>
      <url>http://r.jakewharton.com/maven/release</url>
    </repository>



Developed By
============

 * Jake Wharton - <jakewharton@gmail.com>



License
=======

    Copyright 2011 Jake Wharton
    Copyright 2011 Android Open Source Project

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.







 [1]: http://developer.android.com/sdk/compatibility-library.html
 [2]: https://github.com/JakeWharton/Android-VerticalViewPager/downloads
