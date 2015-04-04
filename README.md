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
	compile 'com.github.shell-software:uitools:0.9.0'
}
```

## Activity Stream

[**Full ChangeLog**](https://github.com/shell-software/uitools/blob/master/CHANGELOG.md)

### 1.0.0 - *current*

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

**DensityConverter** contains utility methods for density values conversion based on current device's display metrics. 

To convert the density-independent pixels into density-dependent ones and vice versa:

```java
float pixels = 100.0f;

// Convert to real pixels:
float realPixels = DensityConverter.dpToPx(getContext(), pixels)

// Convert to density-independent pixels:
float densityPixels = DensityConverter.pxToDp(getContext(), pixels);
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

## Shell Software Inc. links

* [Google+](https://plus.google.com/112119444427380215269)
* [Twitter Page](https://twitter.com/shell_software)
