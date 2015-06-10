# UI Tools Library for Android

[![Build Status](https://travis-ci.org/shell-software/uitools.svg?branch=master)](https://travis-ci.org/shell-software/uitools)
[![Maven Central](https://img.shields.io/maven-central/v/com.github.shell-software/uitools.svg)](http://search.maven.org/#search|gav|1|g%3A%22com.github.shell-software%22%20AND%20a%3A%22uitools%22)

## Description

**UI Tools** Library contains lots of useful methods for working with **Android User Interface API**

## Requirements

The Library requires **Android SDK version 9 (Gingerbread)** and higher

## Gradle Dependency

```java
dependencies {
	compile 'com.github.shell-software:uitools:1.1.0'
}
```

## Activity Stream

[**Full ChangeLog**](https://github.com/shell-software/uitools/blob/master/CHANGELOG.md)

### 1.1.0 - *current*

1. Changed the standard Android logging API to **SLF4J Logging API**

### 1.0.0 - *previous*

1. The first release! Everything is new.

### Features in the next versions:

***TBD***

## Usage

### IdGenerator

**IdGenerator** is responsible for views id generation.

To generate the view id:

```java
View view;
// ... view initialization code goes here

view.setId(IdGenerator.next());
```

### ColorModifier

**ColorModifier** contains utility methods for color modification.

To modify the color exposure:

```java
int color = Color.DKGRAY;

// Darken the color:
int darkerColor = ColorModifier.modifyExposure(color, 0.8f);

// Lighten the color:
int lighterColor = ColorModifier.modifyExposure(color, 1.5f);
```

### DensityConverter

**DensityConverter** contains utility methods for density values conversion based on the current device's display metrics. 

To convert the density-independent pixels into density-dependent ones and vice versa:

```java
float pixels = 100.0f;

// Convert to real pixels:
float realPixels = DensityConverter.dpToPx(getContext(), pixels)

// Convert to density-independent pixels:
float densityPixels = DensityConverter.pxToDp(getContext(), pixels);
```

## Logging

To enable logging:

1. Add the following dependency:

	```java
	dependencies {
		compile 'com.github.tony19:logback-android-classic:1.1.1-3'
	}
	```
2. Create the **logback.xml** file in the **src/main/assets** with the sample configuration:

	```xml
	<?xml version="1.0" encoding="UTF-8"?>
	<configuration>
		<appender name="LOGCAT" class="ch.qos.logback.classic.android.LogcatAppender">
			<tagEncoder>
				<pattern>%logger{0}</pattern>
			</tagEncoder>
			<encoder>
				<pattern>%d{HH:mm:ss.SSS} [%thread] [%logger{0}] - %msg%n</pattern>
			</encoder>
		</appender>
	
		<root level="TRACE" additivity="false">
			<appender-ref ref="LOGCAT" />
		</root>
	</configuration>
	```
	> You may wish to configure different appenders with different log levels for packages, classes etc.
	
	> More information about **LOGBack** can be found @ [LOGBack Project Site](http://logback.qos.ch)

3. Add the following **InvalidPackage** ignore rule into **lint.xml** file (located @ the root of the project):

	```xml
	<issue id="InvalidPackage" severity="ignore" />
	```

## License

```
  Copyright 2015 Shell Software Inc.

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
```

## Shell Software Inc. Links

* [Shell Software Inc. Google+ Official Page](https://plus.google.com/112119444427380215269)
* <a href="mailto:com.software.shell@gmail.com?subject=[UI Tools]: Proposals And Suggestions">Shell Software Inc. Gmail</a>
* [Shell Software Inc. Twitter Official Page](https://twitter.com/shell_software)
